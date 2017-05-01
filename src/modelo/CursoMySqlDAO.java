/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Darkfocus
 */
public class CursoMySqlDAO {
    private Connection connection;
    
    private PreparedStatement stmt;

    public CursoMySqlDAO() {
        
        this.connection = ConnectionFactory.getConnection();
    }

    public boolean verificarCurso(String nome) {
        String sql = "select count(curCod) from curso where curNome = ?;";
        int cod = 0;
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cod = rs.getInt(1);
            }
            if (cod > 0) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean cadastrar(CursoBEAN c) {
        String sql = "insert into curso ("
                + "curNome,"
                + "curDescricao,"
                + "curArea)"
                + "values (?,?,?);";
        try {
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getDescricao());
            stmt.setString(3, c.getArea());
           
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<CursoBEAN> listarAll() {
        String sql =" SELECT * FROM stagium2017.curso; ";
        
        ArrayList <CursoBEAN> curAL = new ArrayList <CursoBEAN>();
        
        try {
             stmt = connection.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery();
            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                
                CursoBEAN a = new CursoBEAN();
                
                a.setCodigo(rs.getInt(1));
                a.setNome(rs.getString(2));
                a.setDescricao(rs.getString(3));
                a.setArea(rs.getString(4));
                
                curAL.add(a);
                
            }
            stmt.close();//fecha conexão - OBRIGATORIO SEMPRE!
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return curAL;
    }

    public ArrayList<CursoBEAN> pegarCurso(int x) {
        
        String sql = "SELECT * FROM curso WHERE curCod = ?;";
        
        ArrayList <CursoBEAN> curAL = new ArrayList <CursoBEAN>();
        
         try {
             stmt = connection.prepareStatement(sql); 
             stmt.setInt(1, x);
            ResultSet rs = stmt.executeQuery();
            
             while (rs.next()) {
                 CursoBEAN a = new CursoBEAN();
                 
                 a.setCodigo(rs.getInt(1));
                 a.setNome(rs.getString(2));
                 a.setDescricao(rs.getString(3));
                 a.setArea(rs.getString(4));
                 
                 curAL.add(a);
                 
             }
             stmt.close();
             
            }catch (SQLException e) {
                
            throw new RuntimeException(e);
            
        }
        
        return curAL;
    }

    public void editarCurso(CursoBEAN curso) {
        String sql=" UPDATE curso SET curNome=?, curDescricao=?, curArea=? WHERE curCod=?; ";
         try {
             stmt = connection.prepareStatement(sql); 
             stmt.setString(1, curso.getNome());
             stmt.setString(2, curso.getDescricao());
             stmt.setString(3, curso.getArea());
             stmt.setInt(4, curso.getCodigo());
             
             stmt.executeUpdate();
            stmt.close();
             
           
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
}

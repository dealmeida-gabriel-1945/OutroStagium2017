/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controle.OrientadorControle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class OrientadorMySqlDAO {
    
      private Connection connection;
    
    private PreparedStatement stmt;

    public OrientadorMySqlDAO() {
        
        this.connection = ConnectionFactory.getConnection();
    }

    public ArrayList<OrientadorDoEstagioBEAN> listarAllOrientador() {
        String sql =" SELECT * FROM stagium2017.orientador; ";
         
         ArrayList<OrientadorDoEstagioBEAN> oriAL = new ArrayList<OrientadorDoEstagioBEAN>();
         
         try {
             stmt = connection.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery();
             //joga resultado da consulta no ArrayList
            while (rs.next()) {
                OrientadorDoEstagioBEAN a = new OrientadorDoEstagioBEAN();
                
                a.setCod(rs.getInt(1));
                a.setNome(rs.getString(2));
                a.setFone(rs.getString(3));
                a.setCelular(rs.getString(4));
                a.setEmail(rs.getString(5));
                a.setEndereco(rs.getString(6));
                a.setArea(rs.getString(7));
                
                oriAL.add(a);

            }
            stmt.close();//fecha conexão - OBRIGATORIO SEMPRE!
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return oriAL;
    }

    public boolean cadastrar(OrientadorDoEstagioBEAN o) {
        String sql = "insert into orientador ("
                + "oriNome,"
                + "oriFone,"
                + "oriCelular,"
                + "oriEmail,"
                + "oriEndereco,"
                + "oriArea)"
                + "values (?,?,?,?,?,?);";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, o.getNome());
            stmt.setString(2, o.getFone());
            stmt.setString(3, o.getCelular());
            stmt.setString(4, o.getEmail());
            stmt.setString(5, o.getEndereco());
            stmt.setString(6, o.getArea());
          
           
            
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editar(OrientadorDoEstagioBEAN o) {
        String sql = "UPDATE orientador SET"
                + " oriNome = ?,"
                + " oriFone = ?,"
                + " oriCelular = ?,"
                + " oriEmail = ?,"
                + " oriEndereco = ?,"
                + " oriArea = ?"
                + " WHERE oriCodigo = ?;";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, o.getNome());
            stmt.setString(2, o.getFone());
            stmt.setString(3, o.getCelular());
            stmt.setString(4, o.getEmail());
            stmt.setString(5, o.getEndereco());
            stmt.setString(6, o.getArea());
            stmt.setInt(7, o.getCod());
          
           
            
            
            stmt.execute();
            stmt.close();
            
           
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean excluir(OrientadorDoEstagioBEAN oriObj) {
        String sql = "DELETE FROM orientador WHERE oriEmail = ?;";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, oriObj.getEmail());
            
            
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException e) {
            return false;

        }
    }
    
}

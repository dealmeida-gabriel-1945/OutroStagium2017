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
public class EmpresaMySqlDAO {

    private Connection connection;
    
    private PreparedStatement stmt;

    public EmpresaMySqlDAO() {
        
        this.connection = ConnectionFactory.getConnection();
    }
    
    public int codRepresentante(String nome) {
        String sql = "select repCodigo from representante where repNome = ?;";
        int cod = 0;
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cod = rs.getInt(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cod;
    }

    public ArrayList<RepresentanteLegalBEAN> todosRepresentantes() {
        String sql = "select repNome from representante ;";
        ArrayList<RepresentanteLegalBEAN> representantes = new ArrayList<RepresentanteLegalBEAN>();
        try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                RepresentanteLegalBEAN r = new RepresentanteLegalBEAN();
                r.setNome(rs.getString(1));
                representantes.add(r);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return representantes;
    }

    public boolean verificarEmpresa(String nomeFantasia) {
        String sql = "select count(empCodigo) from empresa where empNomeFantasia = ?;";
        int cod = 0;
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nomeFantasia);
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

    public boolean cadastrar(EmpresaBEAN e) {
        String sql = "insert into empresa ("
                + "empRazaoSocial,"
                + "empNomeFantasia,"
                + "empNRegistro,"
                + "empEndereco,"
                + "empCaixaPostal,"
                + "empFone,"
                + "empCep,"
                + "empEmail,"
                + "empCidade,"
                + "empEstado,"
                + "representante_repCodigo)"
                
                + "values (?,?,?,?,?,?,?,?,?,?,?);";
        
        try {
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, e.getRazaoSocial_nome());
            stmt.setString(2, e.getNomeFantasia());
            stmt.setString(3, e.getNumRegistro());
            stmt.setString(4, e.getEndereco());
            stmt.setString(5, e.getCaixaPostal());
            stmt.setString(6, e.getFone());
            stmt.setString(7, e.getCep());
            stmt.setString(8, e.getEmail());
            stmt.setString(9, e.getCidade());
            stmt.setString(10, e.getEstado());
            stmt.setInt(11, e.getRepresentanteLegal());
           
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException j) {
            throw new RuntimeException(j);
        }
    }

    public ArrayList<EmpresaBEAN> listarAll() {
         String sql =" SELECT empRazaoSocial, empNomeFantasia, empNRegistro, empEndereco, empCaixaPostal, empFone, empCep, empEmail, empCidade, empEstado, repNome, repCodigo, empCodigo "
                 + " FROM empresa JOIN representante "
                 + " WHERE representante_repCodigo = repCodigo; ";
         
         ArrayList<EmpresaBEAN> empAL = new ArrayList<EmpresaBEAN>();
         
         try {
             stmt = connection.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery();
             //joga resultado da consulta no ArrayList
            while (rs.next()) {
                EmpresaBEAN a = new EmpresaBEAN();
                
                a.setRazaoSocial_nome(rs.getString(1));
                a.setNomeFantasia(rs.getString(2));
                a.setNumRegistro(rs.getString(3));
                a.setEndereco(rs.getString(4));
                a.setCaixaPostal(rs.getString(5));
                a.setFone(rs.getString(6));
                a.setCep(rs.getString(7));
                a.setEmail(rs.getString(8));
                a.setCidade(rs.getString(9));
                a.setEstado(rs.getString(10));
                a.setRepresentanteLegalNome(rs.getString(11));
                a.setRepresentanteLegalCodigo(rs.getInt(12));
                a.setCod(rs.getInt(13));
                
                empAL.add(a);

            }
            stmt.close();//fecha conexão - OBRIGATORIO SEMPRE!
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return empAL;
    }

    
    
}

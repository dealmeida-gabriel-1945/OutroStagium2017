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
 * @author user
 */
public class RepresentanteLegalMySqlDAO {
    
     private Connection connection;
    
    private PreparedStatement stmt;

    public RepresentanteLegalMySqlDAO() {
        
        this.connection = ConnectionFactory.getConnection();
    }

    public ArrayList<RepresentanteLegalBEAN> listaAll() {
        String sql =" SELECT * FROM stagium2017.representante; ";
         
         ArrayList<RepresentanteLegalBEAN> repAL = new ArrayList<RepresentanteLegalBEAN>();
         
         try {
             stmt = connection.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery();
             //joga resultado da consulta no ArrayList
            while (rs.next()) {
                RepresentanteLegalBEAN a = new RepresentanteLegalBEAN();
                
                a.setCodigo(rs.getInt(1));
                a.setNome(rs.getString(2));
                a.setCpf(rs.getString(3));
                a.setRg(rs.getString(4));
                a.setOrgEmissor(rs.getString(5));
                a.setEstadoCivil(rs.getString(6));
                a.setNacionalidade(rs.getString(7));
                a.setEndereco(rs.getString(8));
                a.setCep(rs.getString(9));
                a.setFone_contato(rs.getString(10));
                a.setEmail(rs.getString(11));
                
                repAL.add(a);

            }
            stmt.close();//fecha conexão - OBRIGATORIO SEMPRE!
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return repAL;
    }

    public boolean cadastrar(RepresentanteLegalBEAN rep) {
        String sql = "insert into representante ("
                + "repNome,"
                + "repCpf,"
                + "repRg,"
                + "repOrgEmissor,"
                + "repEstadoCivil,"
                + "repNacionalidade,"
                + "repEndereco,"
                + "repCep,"
                + "repFone,"
                + "repEmail)"
                + "values (?,?,?,?,?,?,?,?,?,?);";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, rep.getNome());
            stmt.setString(2, rep.getCpf());
            stmt.setString(3, rep.getRg());
            stmt.setString(4, rep.getOrgEmissor());
            stmt.setString(5, rep.getEstadoCivil());
            stmt.setString(6, rep.getNacionalidade());
            stmt.setString(7, rep.getEndereco());
            stmt.setString(8, rep.getCep());
            stmt.setString(9, rep.getFone_contato());
            stmt.setString(10, rep.getEmail());
            
            
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editar(RepresentanteLegalBEAN rep) {
        String sql = "UPDATE representante SET"
                + " repNome = ?,"
                + " repCpf = ?,"
                + " repRg = ?,"
                + " repOrgEmissor = ?,"
                + " repEstadoCivil = ?,"
                + " repNacionalidade = ?,"
                + " repEndereco = ?,"
                + " repCep = ?,"
                + " repFone = ?,"
                + " repEmail = ?"
                + " WHERE repCodigo = ?;";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, rep.getNome());
            stmt.setString(2, rep.getCpf());
            stmt.setString(3, rep.getRg());
            stmt.setString(4, rep.getOrgEmissor());
            stmt.setString(5, rep.getEstadoCivil());
            stmt.setString(6, rep.getNacionalidade());
            stmt.setString(7, rep.getEndereco());
            stmt.setString(8, rep.getCep());
            stmt.setString(9, rep.getFone_contato());
            stmt.setString(10, rep.getEmail());
            stmt.setInt(11, rep.getCodigo());
            
            
            
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}

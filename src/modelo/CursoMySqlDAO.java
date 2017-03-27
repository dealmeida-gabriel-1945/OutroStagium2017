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
    
    
}

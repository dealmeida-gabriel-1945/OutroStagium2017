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
public class EstagioMySqlDAO {

     private Connection connection;
    
    private PreparedStatement stmt;
    
     public EstagioMySqlDAO() {
         
        this.connection = ConnectionFactory.getConnection();
        
    }
    
    public ArrayList<AlunoBEAN> todosAlunos() {
        String sql = "select aluNome from aluno ;";
        ArrayList<AlunoBEAN> alunos = new ArrayList<AlunoBEAN>();
        try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AlunoBEAN a = new AlunoBEAN();
                a.setNome(rs.getString(1));
                alunos.add(a);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return alunos;
    }

    public ArrayList<EmpresaBEAN> todasEmpresas() {
        String sql = "select empRazaoSocial from empresa ;";
        ArrayList<EmpresaBEAN> empresas = new ArrayList<EmpresaBEAN>();
        try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                EmpresaBEAN e = new EmpresaBEAN();
                e.setRazaoSocial_nome(rs.getString(1));
                empresas.add(e);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return empresas;
    }

    public ArrayList<OrientadorDoEstagioBEAN> todosOri() {
        String sql = "select oriNome from orientador ;";
        ArrayList<OrientadorDoEstagioBEAN> orientadores = new ArrayList<OrientadorDoEstagioBEAN>();
        try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                OrientadorDoEstagioBEAN o = new OrientadorDoEstagioBEAN();
                o.setNome(rs.getString(1));
                orientadores.add(o);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return orientadores;
    }

    public boolean cadastrar(EstagioBEAN es) {
        String sql = "insert into estagio ("
                + "estDataInicio,"
                + "estDataFinal,"
                + "estTotalHora,"
                + "estBeneficios,"
                + "estBeneficiosValor,"
                + "aluno_aluMatricula,"
                + "empresa_empCodigo,"
                + "orientador_oriCodigo,"
                + "estSupervisor,"
                + "estHorasMensais,"
                + "estHorarioInicio,"
                + "estHorarioFinal)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, es.getDataInicio());
            stmt.setString(2, es.getDataFinal());
            stmt.setFloat(3, es.getTotalHoras());
            stmt.setString(4, es.getBeneficios());
            stmt.setString(5, es.getBeneficiosValor());
            stmt.setString(6, es.getAluMatricula());
            stmt.setInt(7, es.getEmpCod());
            stmt.setInt(8, es.getOriCod());
            stmt.setString(9, es.getSupervisor());
            stmt.setFloat(10, es.getHorasMens());
            stmt.setString(11, es.getHorarioInicio());
            stmt.setString(12, es.getHorarioFinal());
           
            
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AlunoMySQLDAO {
    
    ArrayList <AlunoBEAN> alunAL = new ArrayList <AlunoBEAN>();
    
     //armazernar meu objeto de conexao com o BD MySQL    
    private Connection connection;
    //objeto stmt que executa as consultas no BD
    private PreparedStatement stmt;

    public AlunoMySQLDAO() {
        //inicializa a conexão com o BD - chamando o FActory e Singleton
        this.connection = ConnectionFactory.getConnection();
    }
                  
    private AlunoBEAN a = new AlunoBEAN();

    public ArrayList<AlunoBEAN> listarAll() {
        
        String sql = " SELECT aluNome, curNome, aluPeriodo, aluTurma, aluMatricula, aluCpf, alunRg, aluOrgEmissor, aluEstadoCivil, aluDataNascimento, aluRepresentanteLegal, aluEndereco, aluEstado, aluCidade, aluCep, aluFone, aluCelular, aluEmail, aluConhecimentoInformatica, aluCarteiraHabilitacao, aluInicioCurso, aluFormatura " +
                     " FROM aluno JOIN  curso " +
                     " WHERE curCod = curso_curCod; ";
        ArrayList <AlunoBEAN> alunAL = new ArrayList <AlunoBEAN>();
        
        try {
             stmt = connection.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery();
            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                //joga os dados do rs dentro de um objeto c do tipo ContatoBEAN
                AlunoBEAN a = new AlunoBEAN();
                a.setNome(rs.getString(1));
                a.setCurso(rs.getString(2));
                a.setAno_Periodo(rs.getString(3));
                a.setTurma(rs.getString(4));
                a.setMatricula(rs.getString(5));
                a.setCpf(rs.getString(6));
                a.setRg(rs.getString(7));
                a.setOrgEmissor(rs.getString(8));
                a.setEstadoCivil(rs.getString(9));
                a.setDataNascimento(rs.getString(10));
                a.setRepresentanteLegal(rs.getString(11));
                a.setEndereco(rs.getString(12));
                a.setEstado(rs.getString(13));
                a.setCidade(rs.getString(14));
                a.setCep(rs.getString(15));
                a.setFone(rs.getString(16));
                a.setCelular(rs.getString(17));
                a.setEmail(rs.getString(18));
                a.setConhecimento_informatica(rs.getString(19));
                a.setCarteira_habilitacao(rs.getString(20));
                a.setInicioDoCurso(rs.getString(21));
                a.setFormatura(rs.getString(22));
                
                alunAL.add(a);
                }
            stmt.close();//fecha conexão - OBRIGATORIO SEMPRE!
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return alunAL;
    }

    public ArrayList<AlunoBEAN> pegaAluno(int matricula) {
        String sql = " SELECT aluNome, curNome, aluPeriodo, aluTurma, aluMatricula, aluCpf, alunRg, aluOrgEmissor, aluEstadoCivil, aluDataNascimento, aluRepresentanteLegal, aluEndereco, aluEstado, aluCidade, aluCep, aluFone, aluCelular, aluEmail, aluConhecimentoInformatica, aluCarteiraHabilitacao, aluInicioCurso, aluFormatura " +
                     " FROM aluno JOIN  curso " +
                     " WHERE curCod = curso_curCod AND aluMatricula = ?; ";
        
                     ArrayList <AlunoBEAN> alunAL = new ArrayList <AlunoBEAN>();
                     
            try {
             stmt = connection.prepareStatement(sql);
              stmt.setInt(1, matricula);
              ResultSet rs = stmt.executeQuery();
              
              while (rs.next()) {
              
                a.setNome(rs.getString(1));
                a.setCurso(rs.getString(2));
                a.setAno_Periodo(rs.getString(3));
                a.setTurma(rs.getString(4));
                a.setMatricula(rs.getString(5));
                a.setCpf(rs.getString(6));
                a.setRg(rs.getString(7));
                a.setOrgEmissor(rs.getString(8));
                a.setEstadoCivil(rs.getString(9));
                a.setDataNascimento(rs.getString(10));
                a.setRepresentanteLegal(rs.getString(11));
                a.setEndereco(rs.getString(12));
                a.setEstado(rs.getString(13));
                a.setCidade(rs.getString(14));
                a.setCep(rs.getString(15));
                a.setFone(rs.getString(16));
                a.setCelular(rs.getString(17));
                a.setEmail(rs.getString(18));
                a.setConhecimento_informatica(rs.getString(19));
                a.setCarteira_habilitacao(rs.getString(20));
                a.setInicioDoCurso(rs.getString(21));
                a.setFormatura(rs.getString(22));
                
                alunAL.add(a);
              }
             stmt.close();
             
            }catch (SQLException e) {
                
            throw new RuntimeException(e);
            
        }
        
        return alunAL;
    }

    public ArrayList<CursoBEAN> todosCursos() {
        String sql = "select curNome from curso ;";
        ArrayList<CursoBEAN> cursos = new ArrayList<CursoBEAN>();
        try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CursoBEAN c = new CursoBEAN();
                c.setNome(rs.getString(1));
                cursos.add(c);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return cursos;
    }

    public int codigoCurso1(String nome) {
        String sql = "select curCod from curso where curNome = ?;";
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

    public boolean verificarAluno(String matricula) {
        String sql = "select count(aluMatricula) from aluno where aluMatricula = ?;";
        int cod = 0;
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, matricula);
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

    public boolean cadastrar1(AlunoBEAN a) {
        String sql = "insert into aluno ("
                + "aluNome,"
                + "aluPeriodo,"
                + "aluMatricula,"
                + "aluCpf,"
                + "alunRg,"
                + "aluOrgEmissor,"
                + "aluEstadoCivil,"
                + "aluDataNascimento,"
                + "aluRepresentanteLegal,"
                + "aluEndereco,"
                + "aluEstado,"
                + "aluCidade,"
                + "aluCep,"
                + "aluFone,"
                + "aluCelular,"
                + "aluEmail,"
                + "aluConhecimentoInformatica,"
                + "aluCarteiraHabilitacao,"
                + "aluInicioCurso,"
                + "aluFormatura,"
                + "curso_curCod,"
                + "aluTurma)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getAno_Periodo());
            stmt.setString(3, a.getMatricula());
            stmt.setString(4, a.getCpf());
            stmt.setString(5, a.getRg());
            stmt.setString(6, a.getOrgEmissor());
            stmt.setString(7, a.getEstadoCivil());
            stmt.setString(8, a.getDataNascimento());
            stmt.setString(9, a.getRepresentanteLegal());
            stmt.setString(10, a.getEndereco());
            stmt.setString(11, a.getEstado());
            stmt.setString(12, a.getCidade());
            stmt.setString(13, a.getCep());
            stmt.setString(14, a.getFone());
            stmt.setString(15, a.getCelular());
            stmt.setString(16, a.getEmail());
            stmt.setString(17, a.getConhecimento_informatica());
            stmt.setString(18, a.getCarteira_habilitacao());
            stmt.setString(19, a.getInicioDoCurso());
            stmt.setString(20, a.getFormatura());
            stmt.setInt(21, a.getCurCodigo());
            stmt.setString(22, a.getTurma());
            
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean editar1(AlunoBEAN a) {
        String sql = "Update aluno set "
                + "aluNome = ?,"
                + "aluPeriodo = ?,"
                + "aluCpf = ?,"
                + "alunRg = ?,"
                + "aluOrgEmissor = ?,"
                + "aluEstadoCivil = ?,"
                + "aluDataNascimento = ?,"
                + "aluRepresentanteLegal = ?,"
                + "aluEndereco = ?,"
                + "aluEstado = ?,"
                + "aluCidade = ?,"
                + "aluCep = ?,"
                + "aluFone = ?,"
                + "aluCelular = ?,"
                + "aluEmail = ?,"
                + "aluConhecimentoInformatica = ?,"
                + "aluCarteiraHabilitacao = ?,"
                + "aluInicioCurso = ?,"
                + "aluFormatura = ?,"
                + "curso_curCod = ?,"
                + "aluTurma = ?"
                + "where aluMatricula = ? ;";
        try {
            
            
            
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, "%" + a.getNome() + "%");
            stmt.setString(2,  "%" + a.getAno_Periodo() + "%");
            stmt.setString(3,  "%" + a.getCpf() + "%");
            stmt.setString(4, "%" + a.getRg() + "%");
            stmt.setString(5, "%" + a.getOrgEmissor() + "%");
            stmt.setString(6, "%" + a.getEstadoCivil() + "%");
            stmt.setString(7, "%" + a.getDataNascimento() + "%");
            stmt.setString(8, "%" + a.getRepresentanteLegal() + "%");
            stmt.setString(9, "%" + a.getEndereco() + "%");
            stmt.setString(10, "%" + a.getEstado() + "%");
            stmt.setString(11, "%" + a.getCidade() + "%");
            stmt.setString(12, "%" + a.getCep() + "%");
            stmt.setString(13, "%" + a.getFone() + "%");
            stmt.setString(14, "%" + a.getCelular() + "%");
            stmt.setString(15, "%" + a.getEmail() + "%");
            stmt.setString(16, "%" + a.getConhecimento_informatica() + "%");
            stmt.setString(17, "%" + a.getCarteira_habilitacao() + "%");
            stmt.setString(18, "%" + a.getInicioDoCurso() + "%");
            stmt.setString(19, "%" + a.getFormatura() + "%");
            stmt.setInt(20, a.getCurCodigo());
            stmt.setString(21, "%" + a.getTurma() + "%");
            stmt.setString(22, "%" + a.getMatricula() + "%");
            
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    
    
}

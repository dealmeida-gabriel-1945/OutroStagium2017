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

    public ArrayList<AlunoBEAN> listarAll() {
        
        String sql = " SELECT aluNome, curNome, aluPeriodo, aluTurma, aluMatricula, aluCpf, alunRg, aluOrgEmissor, aluEstadoCivil, aluDataNascimento, aluRepresentanteLegal, aluEndereco, aluEstado, aluCidade, aluCep, aluFone, aluCelular, aluEmail, aluConhecimentoInformatica, aluCarteiraHabilitacao, aluInicioCurso, aluFormatura " +
                     " FROM aluno JOIN  curso " +
                     " WHERE curCod = curso_curCod; ";
        ArrayList <AlunoBEAN> alunAL = new ArrayList <AlunoBEAN>();
        
        try {
            
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
    
}

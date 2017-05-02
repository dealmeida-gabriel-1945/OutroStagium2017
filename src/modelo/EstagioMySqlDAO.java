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
        String sql = "insert into estagio ( "
                + "estDataInicio, "
                + "estDataFinal, "
                + "estTotalHoras, "
                + "estBeneficios, "
                + "estBeneficiosValor, "
                + "aluno_aluMatricula, "
                + "empresa_empCodigo, "
                + "orientador_oriCodigo, "
                + "estSupervisor, "
                + "estHoraMensais, "
                + "estHorarioInicio, "
                + "estHorarioFinal,"
                + "estDataRelatorio1,"
                + "estDataRelatorio2,"
                + "estDataRelatorio3,"
                + "estDataRelatorio4,"
                + "estTipo,"
                + "estAreaAtuacao) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
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
            stmt.setString(13, es.getDataPrimeiroRelatorio());
            stmt.setString(14, es.getDataSegundoRelatorio());
            stmt.setString(15, es.getDataTerceiroRelatorio());
            stmt.setString(16, es.getDataQuartoRelatorio());
            stmt.setString(17, es.getTipo());
            stmt.setString(18, es.getAreAtuacao());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<EstagioBEAN> listarAll() {
        String sql = " SELECT estCodigo, estAreaAtuacao, estDataInicio, estDataFinal, estTotalHoras, estBeneficios, estBeneficiosValor, estSupervisor, estHoraMensais, estHorarioInicio, estHorarioFinal, estTipo, "
                + "        estDataRelatorio1, estDataRelatorio2, estDataRelatorio3, estDataRelatorio4, "
                + "	aluMatricula, aluNome, aluCpf, alunRg, aluEmail, "
                + "        empCodigo, empNomeFantasia, empRazaoSocial,empFone, empEmail, oriCodigo, oriNome, oriEmail "
                + " FROM estagio JOIN aluno "
                + "             JOIN empresa "
                + "             JOIN orientador "
                + " WHERE aluMatricula = aluno_aluMatricula AND empCodigo = empresa_empCodigo AND oriCodigo = orientador_oriCodigo; ";
        ArrayList<EstagioBEAN> estAL = new ArrayList<EstagioBEAN>();

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                //joga os dados do rs dentro de um objeto c do tipo ContatoBEAN
                EstagioBEAN a = new EstagioBEAN();
                a.setCod(rs.getInt(1));
                a.setAreAtuacao(rs.getString(2));
                a.setDataInicio(rs.getString(3));
                a.setDataFinal(rs.getString(4));
                a.setTotalHoras(rs.getFloat(5));
                a.setBeneficios(rs.getString(6));
                a.setBeneficiosValor(rs.getString(7));
                a.setSupervisor(rs.getString(8));
                a.setHorasMens(rs.getFloat(9));
                a.setHorarioInicio(rs.getString(10));
                a.setHorarioFinal(rs.getString(11));
                a.setTipo(rs.getString(12));
                a.setDataPrimeiroRelatorio(rs.getString(13));
                a.setDataSegundoRelatorio(rs.getString(14));
                a.setDataTerceiroRelatorio(rs.getString(15));
                a.setDataQuartoRelatorio(rs.getString(16));
                a.setAluMatricula(rs.getString(17));
                a.setAluNome(rs.getString(18));
                a.setAluCPF(rs.getString(19));
                a.setAluRG(rs.getString(20));
                a.setAluEmail(rs.getString(21));
                a.setEmpCod(rs.getInt(22));
                a.setEmpNomeFantasia(rs.getString(23));
                a.setEmpRazaoSocial(rs.getString(24));
                a.setEmpTelefone(rs.getString(25));
                a.setEmpEmail(rs.getString(26));
                a.setOriCod(rs.getInt(27));
                a.setOriNome(rs.getString(28));
                a.setOriEmail(rs.getString(29));

                estAL.add(a);
            }
            stmt.close();//fecha conexão - OBRIGATORIO SEMPRE!
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return estAL;
    }

    public void editar(EstagioBEAN es) {
        String sql = "UPDATE estagio SET  "
                + " estDataInicio = ?, "
                + " estDataFinal = ?, "
                + " estTotalHoras = ?, "
                + " estBeneficios = ?, "
                + " estBeneficiosValor = ?, "
                + " aluno_aluMatricula = ?, "
                + " empresa_empCodigo = ?, "
                + " orientador_oriCodigo = ?, "
                + " estSupervisor = ?, "
                + " estHoraMensais = ?, "
                + " estHorarioInicio = ?, "
                + " estHorarioFinal = ?,"
                + " estDataRelatorio1 = ?,"
                + " estDataRelatorio2 = ?,"
                + " estDataRelatorio3 = ?,"
                + " estDataRelatorio4 = ?,"
                + " estTipo = ?,"
                + " estAreaAtuacao = ?"
                + " WHERE estCodigo = ?;";
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
            stmt.setString(13, es.getDataPrimeiroRelatorio());
            stmt.setString(14, es.getDataSegundoRelatorio());
            stmt.setString(15, es.getDataTerceiroRelatorio());
            stmt.setString(16, es.getDataQuartoRelatorio());
            stmt.setString(17, es.getTipo());
            stmt.setString(18, es.getAreAtuacao());
            stmt.setInt(19, es.getCod());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean excluir(EstagioBEAN estObj) {
        String sql = "DELETE FROM estagio WHERE estCodigo = ?;";
        try {

            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, estObj.getCod());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

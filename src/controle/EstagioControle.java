/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.AlunoBEAN;
import modelo.AlunoMySQLDAO;
import modelo.CursoBEAN;
import modelo.CursoMySqlDAO;
import modelo.EmpresaBEAN;
import modelo.EmpresaMySqlDAO;
import modelo.EstagioBEAN;
import modelo.EstagioMySqlDAO;
import modelo.OrientadorDoEstagioBEAN;
import modelo.OrientadorMySqlDAO;

/**
 *
 * @author Darkfocus
 */
public class EstagioControle {

    EstagioMySqlDAO estDAO = new EstagioMySqlDAO();
    AlunoMySQLDAO aluDAO = new AlunoMySQLDAO();
    EmpresaMySqlDAO empDAO = new EmpresaMySqlDAO();
    OrientadorMySqlDAO oriDAO = new OrientadorMySqlDAO();
    ArrayList<EstagioBEAN> estAL = new ArrayList<EstagioBEAN>();
    
    
    public ArrayList<AlunoBEAN> todosAlunos() {
        return estDAO.todosAlunos();
    }

    public ArrayList<EmpresaBEAN> todasEmpresas() {
        return estDAO.todasEmpresas();
    }

    public ArrayList<OrientadorDoEstagioBEAN> todosOri() {
        return estDAO.todosOri();
    }

    

    public ArrayList<AlunoBEAN> pegaAlunos() {
        return aluDAO.listarAll();
    }

    public ArrayList<EmpresaBEAN> pegaEmpresas() {
        return empDAO.listarAll();
    }

    public boolean cadastrar1(EstagioBEAN est) {
        return estDAO.cadastrar(est);
    }

    public ArrayList<OrientadorDoEstagioBEAN> pegaOrientadores() {
        return oriDAO.listarAllOrientador();
    }

    public ArrayList<EstagioBEAN> povoaTabela() {
        estAL=estDAO.listarAll();
        return estAL;
    }

    public boolean editar(EstagioBEAN est) {
        estDAO.editar(est);
        return true;
    }

    public boolean excluir(EstagioBEAN estObj) {
        return estDAO.excluir(estObj);
    }

    
    
}

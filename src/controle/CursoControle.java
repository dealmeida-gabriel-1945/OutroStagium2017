/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.CursoBEAN;
import modelo.CursoMySqlDAO;

/**
 *
 * @author Darkfocus
 */
public class CursoControle {
    
    private CursoMySqlDAO curDAO = new CursoMySqlDAO();
    ArrayList<CursoBEAN> curAL = new ArrayList<CursoBEAN>();

    public boolean cadastrar(CursoBEAN c) {
        
        boolean v = curDAO.verificarCurso(c.getNome());
         
        if (v == true) {
            return curDAO.cadastrar(c);
        } 
        return false;
    }

    public ArrayList<CursoBEAN> povoaTabela() {
        
        curAL = curDAO.listarAll();
        
        return curAL;
    }

    public ArrayList<CursoBEAN> pegaCurso(int x) {
        
        curAL = curDAO.pegarCurso(x);
        
        return curAL;
    }

    public boolean Editar(CursoBEAN curso) {
        curDAO.editarCurso(curso);
        return true;
    }
    
}

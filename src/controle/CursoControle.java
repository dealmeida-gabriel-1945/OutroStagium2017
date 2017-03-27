/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.CursoBEAN;
import modelo.CursoMySqlDAO;

/**
 *
 * @author Darkfocus
 */
public class CursoControle {
    
    private CursoMySqlDAO curDAO = new CursoMySqlDAO();

    public boolean cadastrar(CursoBEAN c) {
        
        boolean v = curDAO.verificarCurso(c.getNome());
         
        if (v == true) {
            return curDAO.cadastrar(c);
        } 
        return false;
    }
    
}

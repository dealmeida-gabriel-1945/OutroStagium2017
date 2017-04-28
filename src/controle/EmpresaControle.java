/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.EmpresaBEAN;
import modelo.EmpresaMySqlDAO;
import modelo.RepresentanteLegalBEAN;

/**
 *
 * @author Darkfocus
 */
public class EmpresaControle {
    
    private EmpresaMySqlDAO eDAO = new EmpresaMySqlDAO();
    private ArrayList<EmpresaBEAN> empAL = new ArrayList<EmpresaBEAN>();

    public ArrayList<RepresentanteLegalBEAN> todosRep() {
        return eDAO.todosRepresentantes();
    }

    public int codigoRepresentante(String rep) {
        return eDAO.codRepresentante(rep);
    }

    public boolean cadastrar(EmpresaBEAN e) {
        
        boolean v = eDAO.verificarEmpresa(e.getNomeFantasia());
        if (v == true) {
            return eDAO.cadastrar(e);
        } 
        return false;
    }

    public ArrayList<EmpresaBEAN> povoaTabela() {
        
        empAL = eDAO.listarAll();
        
        return empAL;
    }
    
}

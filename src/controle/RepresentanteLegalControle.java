/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.RepresentanteLegalBEAN;
import modelo.RepresentanteLegalMySqlDAO;

/**
 *
 * @author user
 */
public class RepresentanteLegalControle {
    
    private RepresentanteLegalMySqlDAO repMSQL = new RepresentanteLegalMySqlDAO();

    public ArrayList<RepresentanteLegalBEAN> povoaTabela() {
        return repMSQL.listaAll();
    }

    public boolean cadastrar(RepresentanteLegalBEAN rep) {
        return repMSQL.cadastrar(rep);
    }

    public boolean editar(RepresentanteLegalBEAN rep) {
        repMSQL.editar(rep);
        return true;
    }
    
}

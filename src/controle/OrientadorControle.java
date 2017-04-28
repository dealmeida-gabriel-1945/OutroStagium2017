/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.OrientadorDoEstagioBEAN;
import modelo.OrientadorMySqlDAO;

/**
 *
 * @author user
 */
public class OrientadorControle {
    
    ArrayList<OrientadorDoEstagioBEAN> oriAL = new ArrayList<OrientadorDoEstagioBEAN>();
    OrientadorMySqlDAO oriMSQL = new OrientadorMySqlDAO();

    public ArrayList<OrientadorDoEstagioBEAN> povoaTabela() {
        return oriMSQL.listarAllOrientador();
    }
    
}

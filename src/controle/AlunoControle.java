/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.AlunoBEAN;
import modelo.AlunoMySQLDAO;

/**
 *
 * @author user
 */
public class AlunoControle {

    ArrayList <AlunoBEAN> alunAL = new ArrayList <AlunoBEAN>();
    AlunoMySQLDAO alunMSQL = new AlunoMySQLDAO();
    
    
    public ArrayList<AlunoBEAN> povoaTabela() {
        
        alunAL = alunMSQL.listarAll();
        
        return alunAL;
    }

    
    
}

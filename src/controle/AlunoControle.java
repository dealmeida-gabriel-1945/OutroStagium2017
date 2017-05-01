/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *blablabla
 */
package controle;

import java.util.ArrayList;
import modelo.AlunoBEAN;
import modelo.AlunoMySQLDAO;
import modelo.CursoBEAN;
                            
/**
 *
 * @author user
 */
public class AlunoControle {

    ArrayList <AlunoBEAN> alunAL = new ArrayList <AlunoBEAN>();
    AlunoMySQLDAO alunMSQL = new AlunoMySQLDAO();
    AlunoBEAN aluB = new AlunoBEAN();
    
    public ArrayList<AlunoBEAN> povoaTabela() {
        
        alunAL = alunMSQL.listarAll();
        return alunAL;
    }

    public ArrayList<AlunoBEAN> pegaAluno(int matricula) {
        
        alunAL = alunMSQL.pegaAluno(matricula);
        
        return alunAL;
        
    }

    public ArrayList<CursoBEAN> todosCursos() {
        return alunMSQL.todosCursos();
    }

    public int codigoCurso(String string) {
        return alunMSQL.codigoCurso1(string);
    }

    public boolean cadastrar(AlunoBEAN alu) {
         boolean v = alunMSQL.verificarAluno(alu.getMatricula());
         
        if (v == true) {
            return alunMSQL.cadastrar1(alu);
        } 
        return false;
    }

    public boolean editar(AlunoBEAN alu) {
        return alunMSQL.editar1(alu);
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Darkfocus
 */
public class EstagioBEAN {
    
                private int cod;
                private String areAtuacao;
                private String dataInicio;
                private String dataFinal;
                private float totalHoras;
                private String beneficios;
                private String beneficiosValor;
                private String supervisor;
                private float horasMens;
                private String horarioInicio;
                private String horarioFinal;
                private String tipo;
                private String dataPrimeiroRelatorio;
                private String dataSegundoRelatorio;
                private String dataTerceiroRelatorio;
                private String dataQuartoRelatorio;
                //================================
                private String aluMatricula;
                private String aluNome;
                private String aluCPF;
                private String aluRG;
                private String aluEmail;
                //================================
                private int empCod;
                private String empNomeFantasia;
                private String empRazaoSocial;
                private String empTelefone;
                private String empEmail;
                //================================
                private int oriCod;
                private String oriNome;
                private String oriEmail;
                
                
    
//==============================================================================

    public String getDataPrimeiroRelatorio() {
        return dataPrimeiroRelatorio;
    }

    public void setDataPrimeiroRelatorio(String dataPrimeiroRelatorio) {
        this.dataPrimeiroRelatorio = dataPrimeiroRelatorio;
    }

    public String getDataSegundoRelatorio() {
        return dataSegundoRelatorio;
    }

    public void setDataSegundoRelatorio(String dataSegundoRelatorio) {
        this.dataSegundoRelatorio = dataSegundoRelatorio;
    }

    public String getDataTerceiroRelatorio() {
        return dataTerceiroRelatorio;
    }

    public void setDataTerceiroRelatorio(String dataTerceiroRelatorio) {
        this.dataTerceiroRelatorio = dataTerceiroRelatorio;
    }

    public String getDataQuartoRelatorio() {
        return dataQuartoRelatorio;
    }

    public void setDataQuartoRelatorio(String dataQuartoRelatorio) {
        this.dataQuartoRelatorio = dataQuartoRelatorio;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    

    public String getEmpNomeFantasia() {
        return empNomeFantasia;
    }

    public void setEmpNomeFantasia(String empNomeFantasia) {
        this.empNomeFantasia = empNomeFantasia;
    }

    public String getEmpRazaoSocial() {
        return empRazaoSocial;
    }

    public void setEmpRazaoSocial(String empRazaoSocial) {
        this.empRazaoSocial = empRazaoSocial;
    }

    public String getEmpTelefone() {
        return empTelefone;
    }

    public void setEmpTelefone(String empTelefone) {
        this.empTelefone = empTelefone;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getOriNome() {
        return oriNome;
    }

    public void setOriNome(String oriNome) {
        this.oriNome = oriNome;
    }

    public String getOriEmail() {
        return oriEmail;
    }

    public void setOriEmail(String oriEmail) {
        this.oriEmail = oriEmail;
    }
    
    

    public String getAluEmail() {
        return aluEmail;
    }

    public void setAluEmail(String aluEmail) {
        this.aluEmail = aluEmail;
    }
    
    

    public String getAluCPF() {
        return aluCPF;
    }

    public void setAluCPF(String aluCPF) {
        this.aluCPF = aluCPF;
    }

    public String getAluRG() {
        return aluRG;
    }

    public void setAluRG(String aluRG) {
        this.aluRG = aluRG;
    }
    
    

    public String getAluNome() {
        return aluNome;
    }

    public void setAluNome(String aluNome) {
        this.aluNome = aluNome;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getBeneficiosValor() {
        return beneficiosValor;
    }

    public void setBeneficiosValor(String beneficiosValor) {
        this.beneficiosValor = beneficiosValor;
    }

    public String getAreAtuacao() {
        return areAtuacao;
    }

    public void setAreAtuacao(String areAtuacao) {
        this.areAtuacao = areAtuacao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public float getTotalHoras() {
        return totalHoras;
    }

    public String getBeneficios() {
        return beneficios;
    }

 

    public String getAluMatricula() {
        return aluMatricula;
    }

    public int getEmpCod() {
        return empCod;
    }

    public int getOriCod() {
        return oriCod;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public float getHorasMens() {
        return horasMens;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

   
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setTotalHoras(float totalHoras) {
        this.totalHoras = totalHoras;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }


    public void setAluMatricula(String aluMatricula) {
        this.aluMatricula = aluMatricula;
    }

    public void setEmpCod(int empCod) {
        this.empCod = empCod;
    }

    public void setOriCod(int oriCod) {
        this.oriCod = oriCod;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public void setHorasMens(float horasMens) {
        this.horasMens = horasMens;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
    
    
    
}

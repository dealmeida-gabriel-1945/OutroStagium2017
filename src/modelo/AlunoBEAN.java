/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author user
 */
public class AlunoBEAN {
    
    private String nome;
    private String curso;
    private int curCodigo;
    private String ano_Periodo;
    private String turma;
    private String matricula;
    private String tipo_Matematica;
    private String cpf;
    private String rg;
    private String orgEmissor;
    private String estadoCivil;
    private String dataNascimento;
    private String representanteLegal; //aluno menor
    private String endereco;           //rua/av; num e bairro
//==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==  ==    
    private String estado;
    private String cidade;
    private String cep;
    private String fone;
    private String celular;
    private String email;
    private String conhecimento_informatica;
    private String carteira_habilitacao;
    private String inicioDoCurso;
    private String formatura;
    
//==============================================================================
//==============================================================================

    public void setCurCodigo(int curCodigo) {
        this.curCodigo = curCodigo;
    }

    public int getCurCodigo() {
        return curCodigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAno_Periodo() {
        return ano_Periodo;
    }

    public void setAno_Periodo(String ano_Periodo) {
        this.ano_Periodo = ano_Periodo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo_Matematica() {
        return tipo_Matematica;
    }

    public void setTipo_Matematica(String tipo_Matematica) {
        this.tipo_Matematica = tipo_Matematica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgEmissor() {
        return orgEmissor;
    }

    public void setOrgEmissor(String orgEmissor) {
        this.orgEmissor = orgEmissor;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConhecimento_informatica() {
        return conhecimento_informatica;
    }

    public void setConhecimento_informatica(String conhecimento_informatica) {
        this.conhecimento_informatica = conhecimento_informatica;
    }

    public String getCarteira_habilitacao() {
        return carteira_habilitacao;
    }

    public void setCarteira_habilitacao(String carteira_habilitacao) {
        this.carteira_habilitacao = carteira_habilitacao;
    }

    public String getInicioDoCurso() {
        return inicioDoCurso;
    }

    public void setInicioDoCurso(String inicioDoCurso) {
        this.inicioDoCurso = inicioDoCurso;
    }

    public String getFormatura() {
        return formatura;
    }

    public void setFormatura(String formatura) {
        this.formatura = formatura;
    }

}
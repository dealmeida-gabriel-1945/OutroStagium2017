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
public class EmpresaBEAN {
    
    private String razaoSocial_nome;
    private String nomeFantasia;
    private String numRegistro; //CNPJ, INSC, ESTADUAL, NUM CONSELHO
    private String endereco;    //Rua/Av; numero e bairro
    private String caixaPostal;
    private String fone;
    private String cep;
    private String email;
    private String cidade;
    private String estado;
    private int representanteLegal;
    
//==============================================================================

    public String getRazaoSocial_nome() {
        return razaoSocial_nome;
    }

    public void setRazaoSocial_nome(String razaoSocial_nome) {
        this.razaoSocial_nome = razaoSocial_nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(int representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    
    
    
}

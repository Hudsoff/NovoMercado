
package model;

import java.util.Date;

public abstract class Pessoa {
   private int id;
   private String nome;
   private String fone1;
   private String fone2;
   private String email;
   private Date dtCadastro;
   private String observacao;
   private String complementoEndereco;
   private char status;
   private Endereco endereco;
   private String cep;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone1, String fone2, String email, Date dtCadastro, String observacao, String complementoEndereco, char status, Endereco endereco, String cep) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.dtCadastro = dtCadastro;
        this.observacao = observacao;
        this.complementoEndereco = complementoEndereco;
        this.status = status;
        this.endereco = endereco;
        this.cep = cep;
    }
    

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + this.getId() + ", nome=" + this.getNome() + ", fone1=" + this.getFone1() + ", fone2=" + this.getFone2() + ", email=" + this.getEmail() + ", dtCadastro=" + this.getDtCadastro() + ", observacao=" + this.getObservacao() + ", complementoEndereco=" + this.getComplementoEndereco() + ", status=" + this.getStatus() + ", endereco=" + this.getEndereco() + '}';
    }
   
   
   
}

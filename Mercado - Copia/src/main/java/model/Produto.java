package model;

import java.util.Date;

public class Produto {
   private int id;
   private String descricao;
   private float valorCompra;
   private float valorVenda;
   private String undCompra;
   private String undVenda;
   private int fatorConversao;
   private char status;
   private Date dataCadastro;
   private String barraEntrada;
   private String barraSaida;
   private float estoqueMinimo;
   private float estoqueMaximo;
   
   private Classe classe;
   private Marca marca;

    public Produto() {
    }

    public Produto(int id, String descricao, float valorCompra, float valorVenda, String undCompra, String undVenda, int fatorConversao, char status, Date dataCadastro, String barraEntrada, String barraSaida, float estoqueMinimo, float estoqueMaximo, Classe classe, Marca marca) {
        this.id = id;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.undCompra = undCompra;
        this.undVenda = undVenda;
        this.fatorConversao = fatorConversao;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.barraEntrada = barraEntrada;
        this.barraSaida = barraSaida;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.classe = classe;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getUndCompra() {
        return undCompra;
    }

    public void setUndCompra(String undCompra) {
        this.undCompra = undCompra;
    }

    public String getUndVenda() {
        return undVenda;
    }

    public void setUndVenda(String undVenda) {
        this.undVenda = undVenda;
    }

    public int getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getBarraEntrada() {
        return barraEntrada;
    }

    public void setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
    }

    public String getBarraSaida() {
        return barraSaida;
    }

    public void setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
    }

    public float getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(float estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public float getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + this.getId() + ", descricao=" + this.getDescricao() + ", valorCompra=" + this.getValorCompra() + ", valorVenda=" + this.getValorVenda() + ", undCompra=" + this.getUndCompra() + ", undVenda=" + this.getUndVenda() + ", fatorConversao=" + this.getFatorConversao() + ", status=" + this.getStatus() + ", dataCadastro=" + this.getDataCadastro() + ", barraEntrada=" + this.getBarraEntrada() + ", barraSaida=" + this.getBarraSaida() + ", estoqueMinimo=" + this.getEstoqueMinimo() + ", estoqueMaximo=" + this.getEstoqueMaximo() + ", classe=" + this.getClasse() + ", marca=" + this.getMarca() + '}';
    }
   
   
}


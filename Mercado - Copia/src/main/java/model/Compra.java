package model;

import java.sql.Time;
import java.util.Date;

public class Compra {
    private int id;
    private Date dataCompra;
    private Time horaCompra;
    private String numeroNF;
    private String tipoNF;
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalNF;
    private char status;
    
    private Fornecedor fornecedor;
    private CondicaoPgto condicaopgto;
    private ItensCompra itenscompra;
    

    public Compra() {
    }

    public Compra(int id, Date dataCompra, Time horaCompra, String numeroNF, String tipoNF, float valorDesconto, float valorAcrescimo, float totalNF, char status, Fornecedor fornecedor, CondicaoPgto condicaopgto, ItensCompra itenscompra) {
        this.id = id;
        this.dataCompra = dataCompra;
        this.horaCompra = horaCompra;
        this.numeroNF = numeroNF;
        this.tipoNF = tipoNF;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalNF = totalNF;
        this.status = status;
        this.fornecedor = fornecedor;
        this.condicaopgto = condicaopgto;
        this.itenscompra = itenscompra;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Time getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Time horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getTotalNF() {
        return totalNF;
    }

    public void setTotalNF(float totalNF) {
        this.totalNF = totalNF;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CondicaoPgto getCondicaopgto() {
        return condicaopgto;
    }

    public void setCondicaopgto(CondicaoPgto condicaopgto) {
        this.condicaopgto = condicaopgto;
    }

    public ItensCompra getItenscompra() {
        return itenscompra;
    }

    public void setItenscompra(ItensCompra itenscompra) {
        this.itenscompra = itenscompra;
    }




    @Override
    public String toString() {
        return "Compra{" + "id=" + this.getId() + ", dataCompra=" + this.getDataCompra() + ", horaCompra=" +  '}';
    }
    
    
}

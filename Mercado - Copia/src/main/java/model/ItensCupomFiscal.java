package model;

import java.util.UUID;

public class ItensCupomFiscal {
    private UUID id;
    private float qtdProduto;
    private float valorUnitarioProduto;
    private char status;
    
    private Produto produto;
    private CupomFiscal cupomfiscal;

    public ItensCupomFiscal() {
    }

    public ItensCupomFiscal(UUID id, float qtdProduto, float valorUnitarioProduto, char status, Produto produto, CupomFiscal cupomfiscal) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.produto = produto;
        this.cupomfiscal = cupomfiscal;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CupomFiscal getCupomfiscal() {
        return cupomfiscal;
    }

    public void setCupomfiscal(CupomFiscal cupomfiscal) {
        this.cupomfiscal = cupomfiscal;
    }

   
    @Override
    public String toString() {
        return "ItensCupomFiscal{" + "id=" + this.getId() + ", qtdProduto=" + this.getQtdProduto() + ", valorUnitarioProduto=" + this.getValorUnitarioProduto() + ", status=" + this.getStatus() + ", produto=" + this.getProduto() + this.getCupomfiscal() +'}';
    }
    
    
    
}

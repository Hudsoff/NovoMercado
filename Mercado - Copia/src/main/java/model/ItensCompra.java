package model;
public class ItensCompra {
    private int id;
    private float qtdProduto;
    private float valorUnitarioProduto;
    private char status;
    
    private Produto produto;

    public ItensCompra() {
    }

    public ItensCompra(int id, float qtdProduto, float valorUnitarioProduto, char status, Produto produto) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "ItensCompra{" + "id=" + this.getId() + ", qtdProduto=" + this.getQtdProduto() + ", valorUnitarioProduto=" + this.getValorUnitarioProduto() + ", status=" + this.getStatus() + this.getProduto() +'}';
    }
    
    
}

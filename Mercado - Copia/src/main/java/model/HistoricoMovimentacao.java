package model;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class HistoricoMovimentacao {
    private UUID id;
    private Date data;
    private Time hora;
    private char tipo;
    private float qtd;
    private char status;
    
    private Produto produto;

    public HistoricoMovimentacao() {
    }

    public HistoricoMovimentacao(UUID id, Date data, Time hora, char tipo, float qtd, char status, Produto produto) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.qtd = qtd;
        this.status = status;
        this.produto = produto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
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

    @Override
    public String toString() {
        return "HistoricoMovimentacao{" + "id=" + this.getId() + ", data=" + this.getData() + ", hora=" + this.getHora() + ", tipo=" + this.getTipo() + ", qtd=" + this.getQtd() + ", status=" + this.getStatus() + ", produto=" + this.getProduto() + '}';
    }
    
    
    
    
    
}

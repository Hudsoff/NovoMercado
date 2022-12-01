package model;

import java.sql.Time;
import java.util.Date;

public class Pagamento {
    private int id;
    private Date dataPagamento;
    private Time horaPagamento;
    private float valorDesconto;
    private float valorAcrescimo;
    private float valorPago;
    private char status;
    private Pagar pagar;

    public Pagamento() {
    }

    public Pagamento(int id, Date dataPagamento, Time horaPagamento, float valorDesconto, float valorAcrescimo, float valorPago, char status, Pagar pagar) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.horaPagamento = horaPagamento;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorPago = valorPago;
        this.status = status;
        this.pagar = pagar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Time getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(Time horaPagamento) {
        this.horaPagamento = horaPagamento;
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

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Pagar getPagar() {
        return pagar;
    }

    public void setPagar(Pagar pagar) {
        this.pagar = pagar;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + this.getId() + ", dataPagamento=" + this.getDataPagamento() + ", horaPagamento=" + this.getHoraPagamento() + ", valorDesconto=" + this.getValorDesconto() + ", valorAcrescimo=" + this.getValorAcrescimo() + ", valorPago=" + this.getValorPago() + ", status=" + this.getStatus() + ", pagar=" + this.getPagar() + '}';
    }
    
    
    
    
}

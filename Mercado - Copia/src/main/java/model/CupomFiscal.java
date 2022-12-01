package model;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class CupomFiscal {
    private UUID id;
    private Date dataVenda;
    private Time horaVenda;
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalCupom;
    private char status;

    public CupomFiscal() {
    }

    public CupomFiscal(UUID id, Date dataVenda, Time horaVenda, float valorDesconto, float valorAcrescimo, float totalCupom, char status) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalCupom = totalCupom;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Time getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(Time horaVenda) {
        this.horaVenda = horaVenda;
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

    public float getTotalCupom() {
        return totalCupom;
    }

    public void setTotalCupom(float totalCupom) {
        this.totalCupom = totalCupom;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CupomFiscal{" + "id=" + this.getId() + ", dataVenda=" + this.getDataVenda() + ", horaVenda=" + this.getHoraVenda() + ", valorDesconto=" + this.getValorDesconto() + ", valorAcrescimo=" + this.getValorAcrescimo() + ", totalCupom=" + this.getTotalCupom() + ", status=" + this.getStatus() + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author emanu
 */
public class Saida {
    private int id;
    private Lote lote;
    private Distribuidora distribuidora;
    private Gerente gerente;
    private String dataDeSaida;

    public Saida() {
    }

    public Saida(Lote lote, Distribuidora distribuidora, Gerente gerente, String dataDeSaida) {
        this.lote = lote;
        this.distribuidora = distribuidora;
        this.gerente = gerente;
        this.dataDeSaida = dataDeSaida;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(String dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    
    
    
}

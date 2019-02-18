/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author emanu
 */
public class Lote {
    private int id;
    private Gerente gerente;
    private Fornecedora fornecedora;
    private int qtdProduto;
    private Produto produto;
    private String validade;
    private String dataDeEntrada;
    private boolean disponivel;

    public Lote() {
    }

    public Lote(Gerente gerente, Fornecedora fornecedora, Produto produto, int qtdProduto, String validade, String dataDeEntrada) {
        this.gerente = gerente;
        this.fornecedora = fornecedora;
        this.produto = produto;
        this.qtdProduto = qtdProduto;
        this.validade = validade;
        this.dataDeEntrada = dataDeEntrada;
        this.disponivel = true;
    }

    public String isDisponivel() {
        if(this.disponivel){
            return "SIM";
        }
        else{
            return "NÃO";
        }
                   
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Fornecedora getFornecedora() {
        return fornecedora;
    }

    public void setFornecedora(Fornecedora fornecedora) {
        this.fornecedora = fornecedora;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    
    

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author emanu
 */
public class Produto {
    private int id;
    private Categoria caegoria;
    private String marca;
    private double peso;
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(Categoria caegoria, String marca, double peso, String nome, double preco) {
        this.caegoria = caegoria;
        this.marca = marca;
        this.peso = peso;
        this.nome = nome;
        this.preco = preco;
    }
    
    

    public int getId() {
        return id;
    }

    public Categoria getCaegoria() {
        return caegoria;
    }

    

    public String getMarca() {
        return marca;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setCaegoria(Categoria caegoria) {
        this.caegoria = caegoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setId(int id) {
        this.id = id;
    }
}

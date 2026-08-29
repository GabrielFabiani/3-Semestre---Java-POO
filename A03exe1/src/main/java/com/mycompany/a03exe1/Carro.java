
package com.mycompany.a03exe1;

public class Carro {
    
    /*Atributos*/
    private String modelo, cor;
    private int ano,km;
    private double preco;
    
    
    /*Construtor-padrão sem ser parametrizado*/
    public Carro(){
    
    }
    
    /*Construtor parcialmente parametrizado*/
    public Carro(String modelo, int ano, double preco){
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    /*Construtor parametrizado*/
    public Carro(String modelo,String cor, int ano, int km,double preco){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.preco = preco;
    }
    
    /* métodos */
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public int getAno(){
        return ano;
    }
     public int getKm(){
        return km;
    }
    public double getPreco(){
        return preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    } 
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03exe01.pkg1;

/**
 *
 * @author unifgfabiani
 */
public class Funcionario {
    private String nome, sobrenome, sexo;
    private double salarioMensal;
    private int idade, numero;
    
    public Funcionario(){
    
    }
    
    public Funcionario(String nome,String sobrenome,String sexo,double salarioMensal,int idade,int numero){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.setIdade(idade);
        this.setSalarioMensal(salarioMensal);
        this.setNumero(numero);
    }
    
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0 ;
    }
    
    public void setIdade(int idade){
        this.idade = (idade > 0 && idade < 150) ? idade : 0 ;
    }
    
     public void setNumero(int numero){
        this.numero = (numero > 0) ? numero : 0 ;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumero() {
        return numero;
    }
     
    
}

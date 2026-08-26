/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03exe01.pkg1;

/**
 *
 * @author unifgfabiani
 */
public class Aula03exe011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario t1 = new Funcionario();
        Funcionario t2 = new Funcionario("Gabriel", "Teste", "M", 10000, 19, 101);
        
        System.out.printf("f1: %s %s, Sexo: %s, salário: %.2f, idade: %d,"
                + " num: %d\n", 
                t1.getNome(), t1.getSobrenome(), t1.getSexo(), 
                t1.getSalarioMensal(), t1.getIdade(), t1.getNumero());
        
        System.out.printf("f2: %s %s, Sexo: %s, salário: %.2f, idade: %d,"
                + " num: %d\n", 
                t2.getNome(), t2.getSobrenome(), t2.getSexo(), 
                t2.getSalarioMensal(), t2.getIdade(), t2.getNumero());
    }
    
}

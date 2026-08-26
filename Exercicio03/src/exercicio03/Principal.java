package exercicio03;

import java.util.Scanner;

public class Principal {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NomeMenor = "";
        double AlturaMenor = 9999;
        for(int i=0; i<9; i++){
            System.out.println("Digite o nome do aluno: ");
            String nome = input.next();
            
            System.out.println("Digite a altura do aluno: ");
            double altura = input.nextDouble();
            
            
            if(altura < AlturaMenor){
                AlturaMenor = altura;
                NomeMenor = nome;
            }
        }
        
         System.out.println("O(a) aluno(a) " + NomeMenor + " é o(a) mais baixo"
                 + "(a) da turma " + "com: " + AlturaMenor + " centímetros");
    }
    
}

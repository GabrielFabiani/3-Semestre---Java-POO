package exercicio04;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x,y,soma=0;
        
         System.out.println("Digite o primeiro número: ");
         x = input.nextInt();
         
         System.out.println("Digite o segundo número: ");
         y = input.nextInt();
         
         for(int i=x; i<=y; i++){
             if(i%3==0){
                 soma = soma + i;
                 
             }
             
         }
         System.out.println("A soma dos múltiplos é: " + soma);
    }
    
}

package com.mycompany.a03exe1;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        String modeloLocal, corLocal;
        int kmLocal, anoLocal;
        double precoLocal;
        
        Scanner teclado = new Scanner(System.in);
        
        /*== Criando um objeto com construtos padrão*/
        Carro c1 = new Carro();
        
        
        System.out.println("--------- C1 ---------");
        System.out.println("Modelo:......: " + c1.getModelo());
        System.out.println("Cor:......: " + c1.getCor());
        System.out.println("Km:......: " + c1.getKm());
        System.out.println("Ano:......: " + c1.getAno());
        System.out.println("Preco:......: " + c1.getPreco());
        System.out.println("--------- FIM C1 ---------");
        
        
        System.out.println("Digite o modelo: ");
        modeloLocal = teclado.nextLine();
        System.out.println("Digite o ano: ");
        anoLocal = teclado.nextInt();
        System.out.println("Digite o preço: ");
        precoLocal = teclado.nextDouble();
        
        
        teclado.nextLine();
        Carro c2 = new Carro(modeloLocal, anoLocal, precoLocal);
        
        System.out.println("--------- C2 ---------");
        System.out.println("Modelo:......: " + c2.getModelo());
        System.out.println("Cor:......: " + c2.getCor());
        System.out.println("Km:......: " + c2.getKm());
        System.out.println("Ano:......: " + c2.getAno());
        System.out.println("Preco:......: " + c2.getPreco());
        System.out.println("--------- FIM C2 ---------");
        
        
        /*Criando o objeto totalmente parametrizado*/
        System.out.println("Digite o modelo: ");
        modeloLocal = teclado.nextLine();
        System.out.println("Digite a cor: ");
        corLocal = teclado.nextLine();
        System.out.println("Digite o ano: ");
        anoLocal = teclado.nextInt();
        System.out.println("Digite a kilometragem: ");
        kmLocal = teclado.nextInt();
        System.out.println("Digite o preço: ");
        precoLocal = teclado.nextDouble();
        
        teclado.nextLine();

        Carro c3 = new Carro(modeloLocal, corLocal, anoLocal, kmLocal, precoLocal);
        
        System.out.println("--------- C3 ---------");
        System.out.println("Modelo:......: " + c3.getModelo());
        System.out.println("Cor:......: " + c3.getCor());
        System.out.println("Km:......: " + c3.getKm());
        System.out.println("Ano:......: " + c3.getAno());
        System.out.println("Preco:......: " + c3.getPreco());
        System.out.println("--------- FIM C3 ---------");
    }
}

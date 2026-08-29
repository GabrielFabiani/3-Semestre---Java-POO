package com.mycompany.a03exe03;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(2,4,4,4,2,2,4,2);
        
        r1.mostrarDados();
        System.out.println("Perimetro r1......: " + r1.perimetro());
        System.out.println("Largura r1......: " + r1.largura());
        System.out.println("Comprimeto r1......: " + r1.comprimento());
        System.out.println("Area r1......: " + r1.area());
        
        Retangulo r2 = new Retangulo(-2,4,4,4,2,2,4,2);
    }
    
}

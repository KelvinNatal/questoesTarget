package com.target.exercicios.Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = leitor.nextInt();

        System.err.print("Sequência -| ");
        int proximo = 0, anterior = 0, atual = 1;
        
        while(numero != anterior ){
            proximo = anterior + atual;
        	anterior = atual; 
        	atual =  proximo;

            if(anterior > numero){                
                break;
            } else System.out.print(anterior + " ");          
        }

        System.out.println("|-");

        if(anterior > numero) System.out.println("O número " + numero + " não pertence a sequência de Fibonacci");

        else System.out.println("O número " + numero + " pertence a sequência de Fibonacci");
    
    }
}

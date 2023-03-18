package com.target.exercicios.Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a palavra(Sem Espaço): ");
    String string = scan.next();    

     for(int i = string.length(); i> 0 ; i--){
        System.out.print(string.charAt(i-1));
     }

    }   
}

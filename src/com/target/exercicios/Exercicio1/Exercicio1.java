package com.target.exercicios.Exercicio1;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        int indice = 13;
        int soma = 0;
        int k =0;

        while(k < indice){
            k = k + 1;
            soma = soma + k;
        }

        System.out.println(soma);
    }
}

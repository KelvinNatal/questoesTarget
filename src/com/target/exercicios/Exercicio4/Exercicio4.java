package com.target.exercicios.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {

        double soma = 0;
        double percentualRepresentacao = 0;
        
        List<Estados> listaFaturamento = new ArrayList<>(){{
            add(new Estados("SP", 67836.43));
            add(new Estados("RJ", 36678.66));
            add(new Estados("MG", 29229.88));
            add(new Estados("ES", 27165.48));
            add(new Estados("Outros", 19849.53));
        }};

        for (Estados estados : listaFaturamento) {
            soma += estados.getFaturamentoMensal();
            System.out.println(estados);
        }

        System.out.println("A soma é: "+ soma);

        for (Estados estados : listaFaturamento) {
            percentualRepresentacao = (estados.getFaturamentoMensal() * 100) / soma;
            System.out.println("Estado: " + estados.getEstado() + " | Percentual de representação: " + String.format("%.2f", percentualRepresentacao) + " %");
        }
    }
}

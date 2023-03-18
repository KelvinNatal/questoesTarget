package com.target.exercicios.Exercicio4;

public class Estados {
    String estado;
    double faturamentoMensal;

    public Estados() {
    }

    public Estados(String estado, double faturamentoMensal) {
        this.estado = estado;
        this.faturamentoMensal = faturamentoMensal;
    }

    public String getEstado() {
        return estado;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    @Override
    public String toString() {
        return "Estado: " + estado + " | FaturamentoMensal: R$" + faturamentoMensal;
    }

    
    
}



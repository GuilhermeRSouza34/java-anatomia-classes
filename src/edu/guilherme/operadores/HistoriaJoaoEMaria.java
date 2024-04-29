package edu.guilherme.operadores;

public class HistoriaJoaoEMaria {
    public static void main(String[] args) {
        int quantidadeDinheiroJoao = 100;
        int quantidadeDinheiroMaria = 150;

        System.out.println("João tinha " + quantidadeDinheiroJoao + " reais.");
        System.out.println("Maria tinha " + quantidadeDinheiroMaria + " reais.");

        int somaTotal = quantidadeDinheiroJoao + quantidadeDinheiroMaria;
        System.out.println("A soma total do dinheiro de João e Maria é: " + somaTotal);
    }
}

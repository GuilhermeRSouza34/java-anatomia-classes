package edu.guilherme.operadores;

public class ComparacaoDinheiroJoaoEMaria {
    public static void main(String[] args) {
        int quantidadeDinheiroJoao = 100;
        int quantidadeDinheiroMaria = 150;
        int valorComparacao = 200;

        int somaTotal = quantidadeDinheiroJoao + quantidadeDinheiroMaria;

        if (somaTotal == valorComparacao) {
            System.out.println("A soma do dinheiro de João e Maria é igual a " + valorComparacao + ".");
            System.out.println("Vamos comemorar!");
        } else {
            System.out.println("A soma do dinheiro de João e Maria não é igual a " + valorComparacao + ".");
            System.out.println("Precisamos economizar mais.");
        }
    }
}

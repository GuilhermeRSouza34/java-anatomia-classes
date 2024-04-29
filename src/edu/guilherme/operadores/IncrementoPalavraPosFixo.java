package edu.guilherme.operadores;

public class IncrementoPalavraPosFixo {
    public static void main(String[] args) {
        String palavra = "Exemplo";
        System.out.println("Palavra original: " + palavra);

        // Incremento de pósfixo
        palavra = palavra + " Novo";
        System.out.println("Palavra após incremento de pósfixo: " + palavra);
    }
}

package edu.guilherme.operadores;

public class IncrementoPalavraPrefixo {
    public static void main(String[] args) {
        String palavra = "Exemplo";
        System.out.println("Palavra original: " + palavra);

        // Incremento de prefixo
        palavra = "Novo " + palavra;
        System.out.println("Palavra após incremento de prefixo: " + palavra);
    }
}

package edu.guilherme.metodos;

public class VerificadorDePalindromo2 {
    public static boolean ehPalindromo(String palavra) {
        String reverso = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverso += palavra.charAt(i);
        }
        return palavra.equalsIgnoreCase(reverso);
    }

    public static void main(String[] args) {
        // Palavra para verificar
        String palavra = "arara";

        // Chamando o método para verificar se é um palíndromo e exibindo o resultado
        boolean resultado = ehPalindromo(palavra);
        if (resultado) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }
}

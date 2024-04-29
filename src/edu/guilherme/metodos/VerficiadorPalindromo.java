package edu.guilherme.metodos;

public class VerficiadorPalindromo {
    public static boolean ehPalindromo(String palavra) {
        String reverso = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverso += palavra.charAt(i);
        }
        return palavra.equalsIgnoreCase(reverso);
    }
}

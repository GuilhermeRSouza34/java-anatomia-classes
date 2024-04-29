package edu.guilherme.metodos;

public class EncontrarMaiorNumeroMatriz {
    public static int encontrarMaior(int[][] matriz) {
        int maior = matriz[0][0];
        for (int[] linha : matriz) {
            for (int numero : linha) {
                if (numero > maior) {
                    maior = numero;
                }
            }
        }
        return maior;
    }
}

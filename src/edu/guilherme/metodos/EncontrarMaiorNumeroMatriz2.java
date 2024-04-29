package edu.guilherme.metodos;

public class EncontrarMaiorNumeroMatriz2 {

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

    public static void main(String[] args) {
        // Matriz de exemplo
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Chamando o método para encontrar o maior número e exibindo o resultado
        int maiorNumero = encontrarMaior(matriz);
        System.out.println("O maior número na matriz é: " + maiorNumero);
    }
}

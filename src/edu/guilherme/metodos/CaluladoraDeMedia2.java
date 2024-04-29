package edu.guilherme.metodos;

public class CaluladoraDeMedia2 {
    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }

    public static void main(String[] args) {
        // Lista de números
        double[] listaNumeros = { 5.5, 8.0, 6.3, 7.1, 9.2 };

        // Chamando o método para calcular a média e exibindo o resultado
        double media = calcularMedia(listaNumeros);
        System.out.println("A média dos números é: " + media);
    }
}

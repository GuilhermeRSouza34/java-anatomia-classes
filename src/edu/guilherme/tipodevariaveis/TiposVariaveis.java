package edu.guilherme.tipodevariaveis;

public class TiposVariaveis {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.print(numero);

        @SuppressWarnings("unused")
        final double VALORDEPI = 3.14;
    }
}
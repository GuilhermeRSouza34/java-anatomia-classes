package edu.guilherme.metodos;

public class SmartTV {
    private boolean ligada;
    private int canal;
    private int volume;

    // Construtor da SmartTV
    public SmartTV() {
        this.ligada = false; // Inicialmente desligada
        this.canal = 1; // Canal padrão
        this.volume = 50; // Volume padrão
    }

    // Método para ligar ou desligar a TV
    public void ligarDesligar() {
        this.ligada = !this.ligada;
        if (ligada) {
            System.out.println("A TV foi ligada.");
        } else {
            System.out.println("A TV foi desligada.");
        }
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("A TV está desligada ou já está no volume máximo.");
        }
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("A TV está desligada ou já está no volume mínimo.");
        }
    }

    // Método para alterar o canal
    public void alterarCanal(int novoCanal) {
        if (ligada && novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("A TV está desligada ou o canal fornecido é inválido.");
        }
    }

    // Método para definir o canal diretamente
    public void definirCanalDireto(int novoCanal) {
        if (ligada && novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal definido diretamente para: " + canal);
        } else {
            System.out.println("A TV está desligada ou o canal fornecido é inválido.");
        }
    }

    // Método para exibir o estado atual da TV
    public void mostrarEstado() {
        System.out.println("Estado da TV:");
        System.out.println("Ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        // Criando uma SmartTV
        SmartTV minhaTV = new SmartTV();

        // Ligando a TV
        minhaTV.ligarDesligar();

        // Aumentando o volume
        minhaTV.aumentarVolume();

        // Diminuindo o volume
        minhaTV.diminuirVolume();

        // Alterando o canal
        minhaTV.alterarCanal(5);

        // Definindo o canal diretamente
        minhaTV.definirCanalDireto(10);

        // Exibindo o estado atual da TV
        minhaTV.mostrarEstado();
    }
}

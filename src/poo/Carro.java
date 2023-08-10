package poo;

import java.util.Random;

// Classe modelo NÃO tem o método principal, não irá executar
public class Carro {
    int ano;
    String cor;

    //Construtor sem parâmetro
    public Carro() {
        Random gerador = new Random();
        int chassi = gerador.nextInt(1000); // será gerado números aleatórios entre 0 e 999
        System.out.println("Chassi: " + chassi);
    }

    //Construtor com parâmetro
    public Carro(int ano, String cor) {
        this.ano = ano;
        this.cor = cor;
    }

    //Métodos
    void ligar() {
        System.out.println("engine on .........");
    }

    void desligar() {
        System.out.println("engine off .........");
    }

    void acelerar() {
        System.out.println("vrummmmmmmmm");
    }
}

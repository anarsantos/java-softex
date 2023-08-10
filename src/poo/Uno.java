package poo;

public class Uno {
    public static void main(String[] args) {
        //Aqui não gera o número do chassi porque utilizou o construtor sem chassi
        //A principal vangatem de usar esse construtor é a economia nas linhas de cód., define as variáveis dentro dos
        // parênteses na criação do obj
        Carro uno = new Carro(1991, "branco");

        System.out.println("Carro: Uno");
        System.out.println("Ano: " + uno.ano);
        System.out.println("Cor: " + uno.cor);
        uno.ligar();
    }
}

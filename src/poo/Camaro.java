package poo;

public class Camaro {
    public static void main(String[] args) {
        Carro camaro = new Carro(); //Criação do objeto Ferrari usando a classe carro c/o modelo

        //Atribuir valores as variáveis
        camaro.ano = 2012;
        camaro.cor = "amarelo";
        System.out.println("Carro: Camaro");
        System.out.println("Ano: " + camaro.ano);
        System.out.println("Cor: " + camaro.cor);
        camaro.ligar();
        camaro.acelerar();

    }
}

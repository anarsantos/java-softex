package poo;

public class Fusca {
    public static void main(String[] args) {
        Carro fusca = new Carro(); //Criação do objeto Ferrari usando a classe carro c/o modelo

        //Atribuir valores as variáveis
        fusca.ano = 1968;
        fusca.cor = "azul";
        System.out.println("Carro: Ferrari");
        System.out.println("Ano: " + fusca.ano);
        System.out.println("Cor: " + fusca.cor);
        fusca.ligar();
        fusca.acelerar();
        fusca.desligar();
    }
}

package poo;

public class Ferrari {
    public static void main(String[] args) {
        Carro ferrari = new Carro(); //Criação do objeto Ferrari usando a classe carro c/o modelo

        //Atribuir valores as variáveis
        ferrari.ano = 2012;
        ferrari.cor = "vermelho";
        System.out.println("Carro: Ferrari");
        System.out.println("Ano: " + ferrari.ano);
        System.out.println("Cor: " + ferrari.cor);
        ferrari.ligar();
        ferrari.acelerar();
    }
}

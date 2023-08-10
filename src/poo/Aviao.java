package poo;

public class Aviao extends Carro {
    double envergadura;

    void aterrizar() {
        System.out.println("---------___________");
    }

    //Polimorfismo - modificar/sobrescrever o método acelerar
    void acelerar() {
        System.out.println("__________-----------");
    }
}

package exercicios;

/*Exercício 2 - Desenvolva uma aplicação no console (terminal) para calcular o valor da porcentagem usando Regra de 3,
conforme: x% de y = valor*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Regra3 {
    public static void main(String[] args) {
        //variáveis
        double x, y, valor;

        //objetos
        Scanner teclado =  new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        System.out.print("Regra de 3\nx % de = valor\nDigite o valor de x: ");
        x = teclado.nextDouble();

        System.out.print("Digite o valor de y: ");
        y = teclado.nextDouble();

        //processamento
        valor = (x * y) / 100;

        //saída
        System.out.print(x + "% de " + y + " = " + formatador.format(valor));
    }
}

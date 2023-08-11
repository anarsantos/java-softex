package exercicios;

/*Exercício 8 - Desenvolva um aplicativo no console (terminal) para calcular o valor da tabuada.
 O aplicativo deverá perguntar qual é o valor da tabuada a ser calculada.*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //variável
        int valor;

        //objeto
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da tabuada: ");
        valor = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
}

package exercicios;

//Exercício 1 - Desenvolva uma aplicação no console (terminal) que faça a conversão de temperatura em Fahrenheit para Celsius.

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        //variáveis
        double celsius, fahrenheit;

        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");

        System.out.print("Conversão de temperatura\nDigite a temperatura em fahrenheit: ");
        fahrenheit = teclado.nextDouble();

        //processamento
        celsius = (5 * (fahrenheit - 32)) / 9;

        //saída
        System.out.println("Temperatura em Celsius: " + formatador.format(celsius) + "°C"); //Alt + 248 faz o símb grau
    }
}

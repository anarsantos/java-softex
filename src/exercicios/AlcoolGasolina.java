package exercicios;

/* Exercício 5 - A principal diferença de preços e vantagens entre álcool e gasolina está na proporção preço X desempenho.
Para o álcool ser mais vantajoso do que a gasolina, o preço do litro tem que custar até 70% do litro da gasolina.
Baseado nestas informações desenvolva um aplicativo no console (terminal) para determinar qual é o combustível mais
vantajoso para abastecer.
 */

import java.util.Scanner;

public class AlcoolGasolina {
    public static void main(String[] args) {
        //variáveis
        double alcool, gasolina;

        //objetos
        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.print("Álcool x Gasolina\nDigite o valor do álcool: ");
        alcool = teclado.nextDouble();
        System.out.print("Digite o valor da gasolina: ");
        gasolina = teclado.nextDouble();

        //processamento e saída
        if (alcool < 0.7 * gasolina) {
            System.out.println("Abastecer com álcool.");
        } else {
            System.out.println("Abastecer com gasolina.");
        }
    }
}

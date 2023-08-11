package exercicios;

/* Exercício 6: Desenvolva um aplicativo no console (terminal) para calcular o valor do IMC.
O aplicativo deverá exibir além do valor do IMC a classificação de acordo com a tabela do IMC.*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //variáveis
        double peso, altura, imc;

        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.println("Cálculo IMC");

        //entrada
        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Digite a sua altura: ");
        altura = teclado.nextDouble();

        //processamento
        imc = peso / (altura * altura);

        //saída
        System.out.println("IMC: " + formatador.format(imc));

        //classificação
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso ideal.");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso.");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I.");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II (severa).");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}

package exercicios;

/*
Exercício 3 - Desenvolva uma aplicação no console (terminal) de ponto de vendas (PDV), conforme modelo abaixo:
- Valor total: 200,00
- Desconto(%): 5
- Total com desconto: 190,00 (valor calculado)
- Valor pago: 200,00
- Troco: 10,00 (valor calculado)
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {
    public static void main(String[] args) {
        //variáveis
        double total, desconto, totalDesconto, valorPago, troco;

        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        //entrada 1
        System.out.print("PDV\nValor total: ");
        total = teclado.nextDouble();
        System.out.print("Desconto(%): ");
        desconto = teclado.nextDouble();

        //procesamento 1
        totalDesconto = total - (desconto * total) / 100;

        //saída 1
        System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto));

        //entrada 2
        System.out.print("----------------------------------\nValor pago em dinheiro: ");
        valorPago = teclado.nextDouble();

        //processamento 2
        troco = valorPago - totalDesconto;

        //saída
        System.out.println("Troco : R$ " + formatador.format(troco));
    }
}

package exercicios;

/*Exercício 7: Desenvolva o jogo “Pedra – Papel – Tesoura”, conforme modelo abaixo:
JoKenPô

1. Pedra
2. Papel
3. Tesoura

Digite a opção desejada:
Jogador escolheu:
Computador escolheu:
VENCEDOR: */

import java.util.Scanner;

public class JokenPo {
    public static void main(String[] args) {
        // variáveis
        int jogador, computador;

        Scanner teclado = new Scanner(System.in);
        System.out.print("-----------JokenPô-----------\n1. Pedra\n2. Papel\n3. Tesoura\nDigite a opção desejada: ");

        //lógica do jogador
        jogador = teclado.nextInt();
        System.out.println("");
        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu PEDRA.");
                break;
            case 2:
                System.out.println("Jogador escolheu PAPEL.");
                break;
            case 3:
                System.out.println("Jogador escolheu TESOURA.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        //lógica do computador
        /*o (int) converte em num inteiro, "Math.random() * 3" gera número aleatório entre 0 e 2 e
        "+ 1" ao resultado será somando 1 - se sortear o núm. 0 o resultado é 1, se sortear o núm. 1 o resultado é 2 e
        se sortear o núm. 2 o resultado é 3.
         */
        computador = (int) (Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu PEDRA.");
                break;
            case 2:
                System.out.println("Computador escolheu PAPEL.");
                break;
            case 3:
                System.out.println("Computador escolheu TESOURA.");
            default:
                System.out.println("Opção inválida.");
        }

        //lógica que vai determinar o vencedor
        System.out.println();
        if (jogador == computador) {
            System.out.println("EMPATE.");
        } else {
            if ((jogador == 1 && computador == 3) || jogador == 2 && computador == 1 || jogador == 3 && computador == 2) {
                System.out.println("Jogador VENCEU!");
            } else {
                System.out.println("Computador VENCEU!");
            }
        }
    }
}

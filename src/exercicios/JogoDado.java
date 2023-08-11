package exercicios;

/*Exercício 9: Desenvolva um aplicativo no console (terminal) para fazer o lançamento de um dado de 6 faces.
O aplicativo deverá executar um sorteio, exibindo a face do dado sorteada.
Após a exibição da face sorteada o aplicativo deverá perguntar se o jogador deseja lançar o dado novamente.
Se o jogador responder que sim um novo lançamento do dado será executado.*/

import java.util.Scanner;

public class JogoDado {
    public static void main(String[] args) {
        //variável
        char opcao = 's';

        //objeto
        Scanner teclado = new Scanner(System.in);

        while (opcao == 's') {
            System.out.println("Lançamento do dado.");
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face: " + dado);
            System.out.print("Deseja landaçar o dado novamente (s/n)? ");
            opcao = teclado.next().charAt(0);
        }
    }
}

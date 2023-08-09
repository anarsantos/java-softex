package cursoJava;

public class Fundamentos {
    public static void main(String[] args) {
        //Tipos de variáveis (primitivos - byte, short, long, float, double, boolean e char; e não primitivos: String e Object)
        String nome; //outa forma de declarar a variável - String nome = "Terra";
        int idade = 25;
        char sexo = 'M';
        double temperatura = 26.7;
        boolean arCondicionado = false;
        nome = "Sol e Lua";
        System.out.println("Uso de variáveis:\nExemplos:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Ar condicionado: " + arCondicionado);

        double i = 10;
        System.out.println("----------------------------------------\nOperadores aritiméticos e atribuições: \nExemplos:");
        System.out.println("i = " + i);
        System.out.println("i = " + i + " + 5 | i = " + (i + 5));
        System.out.println("i = " + i + " - 5 | i = " + (i - 5));
        System.out.println("i = " + i + " * 5 | i = " + (i * 5));
        System.out.println("i = " + i + " / 5 | i = " + (i / 5));
        System.out.println("i = " + i + " % 5 | i = " + (i % 5));
        System.out.println("i += 5       | i = " + (i += 5));
        System.out.println("i -= 5       | i = " + (i -= 5));
        System.out.println("i *= 5       | i = " + (i *= 5));
        System.out.println("i /= 5       | i = " + (i /= 5));
        i++;
        System.out.println("i++          | i = " + i);
        i--;
        System.out.println("i--          | i = " + i);

        System.out.println("----------------------------------------\nEstruturas de controle: \n\n1) Condicional\nExemplo 1 - uso do 'if':");
        if (sexo == 'M') {
            System.out.println("Alistamento militar obrigatório.");
        }

        System.out.println("\nExemplo 2 - uso do 'if' e 'else':");
        if (idade < 18) {
            System.out.println("Menor de idade.");
        } else {
            System.out.println("Maior de idade.");
        }

        System.out.println("\nExemplo 3 - uso do 'else if':");
        if (idade < 16) {
            System.out.println("Proibido votar.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto facultativo.");
        }

        System.out.println("\nExemplo 4 - uso do 'switch case':\n1. Cadastro de clientes\n2. Cadastro de usuários\n3. Relatórios");
        int opcao = 4;
        switch (opcao) {
            case 1:
                System.out.println("Clientes");
                break;
            case 2:
                System.out.println("Usuários");
                break;
            case 3:
                System.out.println("Relatórios");
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("\n2) Repetição\nExemplo 5 - uso do 'for':");
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        System.out.println("\nExemplo 6 - Tabuada");
        for (int tabuada = 0; tabuada <= 10; tabuada++) {
            System.out.println();
            for (int valor = 0; valor <= 10; valor++) {
                System.out.println(tabuada + " x " + valor + " = " + (tabuada*valor));
            }
        }

        System.out.println("\nExemplo 7 - Uso da estrutura 'while'");
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("\nExemplo 8 - Uso da estrutura 'do while'");
        char novoJogo;
        do {
            System.out.println("Deseja jogar novamente (s/n)?");
            novoJogo = 'n';
        } while (novoJogo == 's');
        System.out.println("Game over!");
    }
}

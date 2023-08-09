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
    }
}

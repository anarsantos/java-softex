package array;

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>();//criação do objeto "contatos"

        //acidionar itens ao objeto contatos
        contatos.add("José de Assis");
        contatos.add("99999-9999");
        contatos.add("ze@email.com");
        contatos.add("Robson Vaamonde");
        contatos.add("5555-9999");
        contatos.add("vava@email.com");

        //para saber o tamanho do array utiliza-se "size()"
        System.out.println("Tamanho do array: " + contatos.size());

        //para exibir todos os itens do array
        System.out.println(contatos);

        //para pegar o e-mail do José de Assis
        System.out.println("E-mail José de Assis (ìndice[2] " + contatos.get(2));

        //percorrer o array com o laço "for" para obter todos os valores
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(contatos.get(i));
        }
    }
}

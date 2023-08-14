package array;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        String[][] agenda = {{"José", "91234-1234", "professorjoseassis@gmail.com"}, {"Bill", "2222-2222",
                "bill@outlook.com"}, {"Linux", "99999-9999", "tux@linux.com"}};

        //pegar o telefone do José
        System.out.println("O telefone do José é: " + agenda[0][1]);

        //mostrar todo o conteúdo do array
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("-----------------------------");
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);
            }
        }
    }
}

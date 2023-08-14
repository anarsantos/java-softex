package array;

public class Array1 {
    public static void main(String[] args) {
        String[] carros = {"ferrari", "fusca", "camaro", "uno"};

        System.out.println("Tamanho do array: " + carros.length);

        //para exibir um carro específico, deve-se inserir o índice
        System.out.println("Carro: " + carros[2]);

        //para modificar o conteúdo do array
        carros[2] = "porsche";
        System.out.println("Carro: " + carros[2]);

        //para exibir TODOS os valores do array "for"
        System.out.println("-----------------------------------");
        System.out.println("Carros:");
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }
    }
}

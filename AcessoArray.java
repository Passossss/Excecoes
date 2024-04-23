import java.util.Scanner;

public class AcessoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Digite um índice para acessar no array:");
        int indice = scanner.nextInt();

        try {
            System.out.println("Valor no índice " + indice + ": " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do tamanho do array.");
        }

        scanner.close();
    }
}
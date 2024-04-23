import java.util.Scanner;
public class ConversaoStringParaInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        String input = scanner.nextLine();

        try {
            int numero = Integer.parseInt(input);
            System.out.println("Número inserido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A entrada não é um número válido.");
        }

        scanner.close();
    }
}

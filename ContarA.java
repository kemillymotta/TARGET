import java.util.Scanner;

public class ContarA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int contagem = contarLetrasA(input);

        if (contagem > 0) {
            System.out.println("A letra 'a' (ou 'A') aparece " + contagem + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não aparece na string.");
        }

        scanner.close();
    }

    public static int contarLetrasA(String str) {
        int contagem = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contagem++;
            }
        }

        return contagem;
    }
}

import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int numero) {
        int a = 0, b = 1;
        
            if (numero == 0) return true;

            while (b <= numero) {
                if (b == numero) {
                    return true; 
            }

            int temp = a;
            a = b;
            b = temp + b;  
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        }else{
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
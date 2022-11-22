import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite un numero para calcular su Fibonacci: ");
        int num = scan.nextInt();
        System.out.println("El Fibonacci de " + num + " es " + fibonacci(num));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


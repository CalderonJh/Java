import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite un numero para calcular su Fibonacci: ");
        int num = scan.nextInt();
        System.out.println("El Fibonacci de " + num + " es " + fibonacci(num));
    }

    public static int fibonacci(int n, int first, int second) {
        if (n < 1) {
            return 0;
        }else if( n == 1 || n == 2){
            return 1;
        } else if(n == 3){
            return first + second;
        }else {
            return fibonacci(n-1, second, first + second);
        }
    }
}


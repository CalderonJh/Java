public class main {
    public static void main(String[] args) {
        System.out.println(fibonacciOptimizado(1,1,10));
    }
    static int hacer(int a, int b){
        if (a == 0){
            return b;
        }
        else{
            return hacer(a - 1, a + b);
        }
    }

    public static int fibonacciOptimizado(int first, int second, int n) {
        if (n == 0 || n == 1)
            return n;
        else if (n == 2) {
            return 1;
        } else if (n == 3)
            return first + second;
        else
            return fibonacciOptimizado(second, first + second, n - 1);

    }

}
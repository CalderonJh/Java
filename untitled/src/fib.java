public class fib {

    public static void main(String[] args) {
        System.out.println(hacer(0,100));
    }
    public static int hacer(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return (a + hacer(a, b - 1));
        }
    }
}
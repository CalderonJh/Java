public class Main {
    public static void main(String[] args) {
        System.out.println(sumaRecursiva(5));
    }
    public static int sumaRecursiva(int n){
        if(n == 1){
            return 1;
        }else{
            return n + sumaRecursiva(n-1);
        }
    }
}
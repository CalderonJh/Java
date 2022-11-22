import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {
        Scanner lecor = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de discos...");
        int n = lecor.nextInt();

        hanoi(n,1,2,3);
        System.out.println("Termina el juego.");
    }
    public static void hanoi(int n, int origen, int destino, int auxiliar){
        if(n>0){
            hanoi(n-1,origen,auxiliar,destino);
            System.out.println("Mover disco "+ n +": De torre "+ origen+ " a torre "+ destino);
            hanoi(n-1,auxiliar,destino,origen);
        }
    }
}

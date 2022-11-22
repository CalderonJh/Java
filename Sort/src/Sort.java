import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 9, 4, 5, 8, 7, 3, 0, 6};
        String[] str = {"Jose", "Juan", "Andres", "Camilo", "Alejandro", "Axel", "Carlos"};

        System.out.println("Orden incial de los vectores");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();

        System.out.println("\nVectores Ordenados");
        int[] dity1 = sort(nums, "ascendente");
        for (int i = 0; i < dity1.length; i++) {
            System.out.print(dity1[i] + " ");
        }
        System.out.println();
        int[] dity2 = sort(nums, "descendente");
        for (int i = 0; i < dity2.length; i++) {
            System.out.print(dity2[i] + " ");
        }
        System.out.println("\n");

        String[] dity3 = sort(str, "ascendente");
        for (int i = 0; i < dity3.length; i++) {
            System.out.print(dity3[i] + " ");
        }
        System.out.println();

        String[] dity4 = sort(str, "descendente");
        for (int i = 0; i < dity4.length; i++) {
            System.out.print(dity4[i] + " ");
        }
        System.out.println("\n");

    }

    final static int[] sort(int[] nums, String way) {
        Arrays.sort(nums);
        int[] aux = new int[nums.length];
        if (way.equals("ascendente")) {
            return nums;

        } else if (way.equals("descendente")) {
            int index = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                aux[index] = nums[i];
                index++;
            }
            return aux;
        }else{
            return null;
        }
    }

    public static String[] sort(String[] strings, String way) {
        Arrays.sort(strings);
        String[] aux = new String[strings.length];
        if (way.equals("ascendente")) {
            return strings;
        } else if (way.equals("descendente")) {
            int index = 0;
            for (int i = strings.length - 1; i >= 0; i--) {
                aux[index] = strings[i];
                index++;
            }
        }
        return aux;
    }
}




import java.util.Scanner;

public class IterarElementos4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Mostrar todos los elementos dentro del arreglo sumándole uno a cada uno. */
        int[] elementos = {1,2,3,4,5,6};

        for (int i : elementos) {
            System.out.println(i + " = " + (i + 1));
        }
        sc.close();
    }
}

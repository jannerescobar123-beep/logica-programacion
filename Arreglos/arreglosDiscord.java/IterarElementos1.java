

import java.util.Scanner;

public class IterarElementos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Iterar por todos los elementos dentro del arreglo utilizando while y
         * mostrarlos en pantalla.
         */
        int elementos[] = { 1, 2, 3, 4, 5, 6 };
        int i = 0;
        while (i < elementos.length) {
            System.out.println(elementos[i]);
            i++;
        }
        sc.close();
    }
}

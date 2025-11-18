package Arreglos;

import java.util.Scanner;

public class IterarElementos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Iterar por todos los elementos dentro del arreglo utilizando el ciclo “for” y mostrarlos en pantalla. */
        int elementos[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
        sc.close();
    }
}

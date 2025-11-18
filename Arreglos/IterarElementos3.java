package Arreglos;

import java.util.Scanner;

public class IterarElementos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Iterar por todos los elementos dentro del arreglo utilizando el ciclo “foreach” y mostrarlos en pantalla. */
        int elementos[] = {1,2,3,4,5,6};
        for(int i : elementos){
            System.out.println(i);
        }
        sc.close();
    }
}
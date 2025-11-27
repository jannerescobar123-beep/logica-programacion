package Arreglos.ArrayList;

import java.util.ArrayList;

public class nivelBasico {
    public static void main(String[] args) {
        /*
         * Suma de Elementos: Se le proporciona un ArrayList de tipo Integer
         * . El programa debe calcular la suma de todos los números presentes en la
         * lista
         * y mostrar el resultado total.
         */

        ArrayList<Integer> numero = new ArrayList<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        int suma = 0;
        for (int i = 0; i < numero.size(); i++) {
            int elemento = numero.get(i);
            suma = suma + elemento;
        }
        System.out.println("la suma total de arraylist es :" + suma);
    }
}

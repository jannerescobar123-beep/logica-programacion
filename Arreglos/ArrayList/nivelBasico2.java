package Arreglos.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class nivelBasico2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("janner");
        nombres.add("juan");
        nombres.add("esteban");
        nombres.add("andrey");
        nombres.add("vanessa");
        nombres.add("diego");
        System.out.println("ingrese un nombre: ");
        String nombre = scanner.nextLine();

        if (nombres.contains(nombre.toLowerCase())) {
            System.out.println("el nombres esta en la lista");
        } else {
            System.out.println("el nombre no esta en la lista");
        }
        scanner.close();
    }

}

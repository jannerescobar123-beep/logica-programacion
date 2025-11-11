package TALLER4;

import java.util.Scanner;

public class ejercisio4_taller3anidadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su promedio");
        int promedio = scanner.nextInt();
        System.out.println("ingrese su nivel socio economico");
        int socioEconomico = scanner.nextInt();
        

        scanner.close();

        if (promedio >= 9) {
            if (socioEconomico < 3) {
                System.out.println("Beca al 100%");
            } else {
                System.out.println("Beca al 50%");
            }
        } else {
            System.out.println("No aplica para beca");
        }
    }
}

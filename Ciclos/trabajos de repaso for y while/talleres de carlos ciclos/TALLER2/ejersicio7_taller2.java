package TALLER2;
import java.util.Scanner;

public class ejersicio7_taller2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1) {
            if (numero <= 100) {
                System.out.println("Numero dentro de rango");
            } else {
                System.out.println("Numero fuera de rango");
            }
        } else {
            System.out.println("Numero fuera de rango");

        }

    }
    
}

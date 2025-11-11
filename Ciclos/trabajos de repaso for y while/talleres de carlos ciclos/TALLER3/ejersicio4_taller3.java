package TALLER3;
import java.util.Scanner;

public class ejersicio4_taller3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero < 100) {
            if (numero > 0) {
                System.out.println("Numero dentro de rango");
            } else {
                System.out.println("Numero fuera de rango");
            }
        } else {
            System.out.println("Numero fuera de rango");

        }
    }
    
}

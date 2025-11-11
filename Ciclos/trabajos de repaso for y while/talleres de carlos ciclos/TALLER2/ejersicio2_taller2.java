package TALLER2;
import java.util.Scanner;

public class ejersicio2_taller2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

    }

    
}

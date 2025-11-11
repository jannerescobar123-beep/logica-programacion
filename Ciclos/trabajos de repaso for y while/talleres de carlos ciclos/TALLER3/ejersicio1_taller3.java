package TALLER3;
import java.util.Scanner;

public class ejersicio1_taller3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 50) {
            if (numero <= 100) {
                System.out.println("Numero valido");
            } else {
                System.out.println("Numero invalido");
            }
        } else {
            System.out.println("Numero invalido");

        }

    }
    
}

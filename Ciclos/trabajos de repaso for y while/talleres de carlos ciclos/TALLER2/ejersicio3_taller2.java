package TALLER2;
import java.util.Scanner;

public class ejersicio3_taller2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.close();

        if (edad >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

    }
    
}

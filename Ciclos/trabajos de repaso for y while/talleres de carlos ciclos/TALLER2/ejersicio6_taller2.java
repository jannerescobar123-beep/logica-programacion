package TALLER2;
import java.util.Scanner;

public class ejersicio6_taller2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación: ");
        int calificación = scanner.nextInt();
        scanner.close();

        if (calificación >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("No aprueba");
        }
    }
    
}

package TALLER2;
import java.util.Scanner;

public class ejersicio4_taller2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        scanner.close();

        if (numero1 > numero2) {
            System.out.println("El " + numero1 + " es mayor");
        } else if (numero2 > numero1) {
            System.out.println("El " + numero2 + " es mayor");
        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
}

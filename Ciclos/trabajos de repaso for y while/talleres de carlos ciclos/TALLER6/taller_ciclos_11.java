package TALLER6;
import java.util.Scanner;

public class taller_ciclos_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();

        short factorial = 1;
        int i = 1;

        while (i <= N) {
            factorial *= i;
            i++;
        }

        System.out.println("El factorial de " + N + " es: " + factorial);

        sc.close();
    }
}

package TALLER6;
import java.util.Scanner;

public class taller_ciclos_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor de N:");
        int N = scanner.nextInt();

        int impar = 1;
        int suma = 0;
        scanner.close();

        for (int i = 1; i <= N; i++) {
            suma += impar;
            System.out.println(i + "^2 = " + suma);

            impar += 2;
        }

    }

}

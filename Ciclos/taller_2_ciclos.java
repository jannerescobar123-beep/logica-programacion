package Ciclos;
import java.util.Scanner;

public class taller_2_ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese N (1 a 9): ");
        int N = scanner.nextInt();

        for (int tabla = 1; tabla <= N; tabla++) {

            for (int i = 1; i <= 9; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }

            System.out.println();
        }

        scanner.close();
    }
}

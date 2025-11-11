package TALLER6;
import java.util.Scanner;

public class taller_ciclos_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N :");
        int N = sc.nextInt();

        int a = 0, b = 1;
        int c;

        System.out.print("Serie de Fibonacci: ");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        sc.close();

    }
}
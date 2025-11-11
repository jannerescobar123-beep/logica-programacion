package TALLER6;
import java.util.Scanner;

public class taller_ciclos_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor de N:");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        scanner.close();

    }

}

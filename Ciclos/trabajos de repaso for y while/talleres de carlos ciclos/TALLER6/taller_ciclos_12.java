package TALLER6;
import java.util.Scanner;

public class taller_ciclos_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero:");
        int N = sc.nextInt();

        System.out.println("ingrese un numero que sera un multiplo:");
        int M = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= N; i++) {
            int multiplo = i * M;
            System.out.println(multiplo);
            suma += multiplo;
        }

        System.out.println("resultado: " + suma);
        sc.close();
    }

}

package TALLER6;
import java.util.Scanner;

public class taller_ciclos_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int N = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= N; i = i + i) {
            System.out.println(i);
            suma += i;
        }
        System.out.println("la suma de 1 hasta: " + N + " es " + suma);
        sc.close();
    }

}

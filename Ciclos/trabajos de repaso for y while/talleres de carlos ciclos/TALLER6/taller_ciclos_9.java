package TALLER6;
import java.util.Scanner;

public class taller_ciclos_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int N = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= N; i = i + i) {
            System.out.println(i);
            suma += i;
            if (i % 2 == 0) {
                suma += i;
                System.out.println(i);
            }
        }
        System.out.println("resultado " + suma);
        sc.close();
    }

}

// Calcular la suma de los primeros N números pares.
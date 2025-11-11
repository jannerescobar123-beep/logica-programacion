package TALLER6;
import java.util.Scanner;

public class taller_ciclos_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de la serie: ");
        int n = scanner.nextInt();
        String serie = " ";
        int suma = 0;
        for (int i = 1; i <= n; i++)

            if (i % 3 == 0) {
                suma -= i;
                serie += " - " + i;

            } else {
                suma += i;
                serie += " + " + i;
            }
        System.out.println("serie:" + serie);
        System.out.println("La suma de la serie es: " + suma);

        scanner.close();

    }
}

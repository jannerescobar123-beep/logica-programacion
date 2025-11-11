package repaso;
import java.util.Scanner;

public class SeriePotenciaDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int N = sc.nextInt();

        double suma = 0;
        int pos = 1; // controla el ciclo (+ + + - -)
        String serie = "";

        for (int i = 1; i <= N; i++) {
            double termino = (i * i) / (2.0 * i); // i^2 / (2*i)

            if (pos <= 3) {
                suma += termino;
                serie += " + " + i + "^2/" + (2 * i);
            } else {
                suma -= termino;
                serie += " - " + i + "^2/" + (2 * i);
            }

            pos++;
            if (pos > 5) pos = 1; // reinicia ciclo cada 5
        }

        System.out.println("Serie:" + serie);
        System.out.println("Suma = " + suma);

        sc.close();
    }
}


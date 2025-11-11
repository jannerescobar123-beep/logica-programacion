package repaso;
import java.util.Scanner;

public class SerieFraccionesSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N (impar): ");
        int N = sc.nextInt();

        double suma = 0;
        int pos = 1; // controla el ciclo de 5 términos
        String serie = "";

        for (int i = 1; i <= N; i += 2) { // solo impares
            double termino = 1.0 / i;

            if (pos <= 3) {
                suma += termino;
                serie += " + 1/" + i;
            } else {
                suma -= termino;
                serie += " - 1/" + i;
            }

            pos++;
            if (pos > 5) pos = 1; // reinicia cada 5
        }

        System.out.println("Serie:" + serie);
        System.out.println("Suma = " + suma);

        sc.close();
    }
}


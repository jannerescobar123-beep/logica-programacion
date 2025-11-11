package repaso;
import java.util.Scanner;

public class SerieCuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int N = sc.nextInt();

        // Inicializamos con el primer término 1^2
        int suma = 1;
        String serie = "1^2";
        int pos = 2; // ya ocupamos la posición 1 con el 1^2

        for (int i = 3; i <= N; i += 2) {
            int term = i * i;
            if (pos <= 3) {
                suma += term;
                serie += " + " + i + "^2";
            } else {
                suma -= term;
                serie += " - " + i + "^2";
            }

            pos++;
            if (pos > 5) pos = 1;
        }

        System.out.println("Serie: " + serie);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}


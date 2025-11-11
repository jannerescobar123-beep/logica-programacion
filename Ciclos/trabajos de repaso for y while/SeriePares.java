package repaso;
import java.util.Scanner;

public class SeriePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int N = sc.nextInt();

        int suma = 2;           // primer número de la serie
        String serie = "2";     // iniciamos la serie con "2"
        int pos = 2;            // ya ocupamos la primera posición con el 2

        for (int i = 4; i <= N; i += 2) { // recorre los pares
            if (pos <= 3) {
                suma += i;
                serie += " + " + i;
            } else {
                suma -= i;
                serie += " - " + i;
            }

            pos++;
            if (pos > 5) pos = 1; // reinicia el ciclo cada 5 términos
        }

        System.out.println("Serie: " + serie);
        System.out.println("La suma de la serie es: " + suma);

        sc.close();
    }
}
//S = 2 + 4 + 6 − 8 − 1 0 + 1 2 + 1 4 + 1 6 − 1 8 − 2 0 + ⋯ + N
// tres positivos 2 negativo 
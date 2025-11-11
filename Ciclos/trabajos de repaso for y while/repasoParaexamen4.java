package repaso;
import java.util.Scanner;

public class repasoParaexamen4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese el valor de N:");
        int N = scanner.nextInt();
        scanner.close();
        String serie = "1";
        int suma = 1;
        int limitePosi = 1;
        int limiteNega = 1;
        int numeroPosi = 1;
        int numeroNega = 0;

        for (int i = 2; i <= N; i++) {
            if (numeroPosi < limitePosi) {
                serie += " + " + i;
                suma += i;
                numeroPosi++;
            } else {
                serie = serie + " - " + i;
                suma = suma - i;
                numeroNega = numeroNega + 1;
            }
            if (numeroNega == limiteNega) {
                numeroNega = 0;
                numeroPosi = 0;
                limitePosi = 2;

            }
        }
        System.out.println("S= " + serie);
        System.out.println("el resultado es: " + suma);

    }

}

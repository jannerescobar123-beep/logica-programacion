package repaso;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese bel valor de N:");
        int N = scanner.nextInt();
        scanner.close();
        String serie = " ";
        int suma = 0;
        int limiteNega = 2;
        int limitePosi = 2;
        int numeroNega = 0;
        int numeroPosi = 0;
        for (int i = 10; i <= N; i = i + 10) {
            if (numeroNega < limiteNega) {
                serie = serie + " - " + i;
                suma = suma - i;
                numeroNega++;
            } else {
                serie = serie + " + " + i;
                suma = suma + i;
                numeroPosi++;
            }
            if (numeroNega == limiteNega && numeroPosi == limitePosi) {
                numeroNega = 0;
                numeroPosi = 0;
                limitePosi++;
            }
        }
        System.out.println(" S= " + serie);
        System.out.println("el resultado es :" + suma);

    }

}

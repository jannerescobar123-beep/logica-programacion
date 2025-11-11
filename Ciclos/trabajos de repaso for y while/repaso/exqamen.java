package repaso;
import java.util.Scanner;

public class exqamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese el valor de N: ");
        int N = scanner.nextInt();
        scanner.close();

        String serie = "";
        int suma = 0;
        int limiteNega = 4;
        int limitePosi = 2;
        int positivo = 0;
        int negativo = 0;

        for (int i = 2; i <= N; i = i + 2) {
            if (negativo < limiteNega) {
                serie = serie + " - " + i;
                suma = suma - i;
                negativo++;

            } else {
                serie += " + " + i;
                suma = suma + i;
                positivo++;
            }
            if (positivo == limitePosi) {
                positivo = 0;
                negativo = 0;
            }

        }
        System.out.println(" S= " + serie);
        System.out.println(" el resultado es: " + suma);
    }

}

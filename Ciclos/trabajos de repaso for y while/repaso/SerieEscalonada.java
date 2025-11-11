package repaso;
import java.util.Scanner;

public class SerieEscalonada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Serie: 1 -2 -3 +4 +5 +6 -7 -8 -9 -10 +11 +12 +13 +14 +15 ...
        System.out.println("Digite el valor de N:");
        int N = scanner.nextInt();
        scanner.close();

        String serie = " ";
        int suma = 0;

        int limitePosi = 1; // primer bloque de positivos
        int limiteNega = 2; // primer bloque de negativos
        int contadorposi = 0;
        int contadornega = 0;

        for (int i = 1; i <= N; i++) {

            // BLOQUE POSITIVO
            if (contadorposi < limitePosi && contadornega == 0) {
                suma += i;
                serie += " + " + i;
                contadorposi++;

                if (contadorposi == limitePosi) {
                    contadorposi = 0; // reinicia
                    contadornega = 1; // activa bloque negativo
                }
            }

            // BLOQUE NEGATIVO
            if (contadornega > 0) {
                suma -= i;
                serie += " - " + i;
                contadornega++;

                if (contadornega > limiteNega) {
                    contadornega = 0; // reinicia
                    limiteNega++; // bloque negativo crece
                    limitePosi++; // bloque positivo también crece
                }
            }
        }

        System.out.println("Serie:" + serie);
        System.out.println("Resultado de la suma = " + suma);
    }
}

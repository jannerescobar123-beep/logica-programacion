package TALLER6;
import java.util.Scanner;

public class taller_ciclos_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // S = 1 – 2 + 3 – 4 + 5 – 6 … + n

        int n = scanner.nextInt();
        String numerosTexto = "";
        boolean esPositivo = true;

        for (int i = 1; i <= n; i = i + 1) {

            if (esPositivo) {
                numerosTexto = numerosTexto + " + " + i;
                esPositivo = false;
            } else {
                numerosTexto = numerosTexto + " - " + i;
                esPositivo = true;
            }

        }

        System.out.println(numerosTexto);
        scanner.close();
    }
}

package TALLER6;
import java.util.Scanner;

public class taller_ciclos_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero N: ");

        int N = scanner.nextInt();
        int numeroPostivo = 0;
        int limiteNumero = 1;
        int total = 0;

        scanner.close();

        String numeroTexto = " ";
        // S = 1 – 2 + 3 + 4 – 5 + 6 + 7 + 8 – 9 + 10 + 11 + 12 + 13 – 14 + … + N
        for (int i = 1; i <= N; i++) {
            if (numeroPostivo < limiteNumero) {

                numeroPostivo += 1;
                numeroTexto += " + " + i;
                total += i;

            } else {
                limiteNumero += 1;
                numeroPostivo = 0;
                numeroTexto += " - " + i;
                total -= i;

            }
        }

        System.out.println("Ingrese el numero de la serie S: " + numeroTexto);
        System.out.println("Ingrese el numero de la serie S: " + total);

    }
}

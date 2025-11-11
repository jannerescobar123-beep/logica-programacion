package repaso;
import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese el valor de N:");
        int N = scanner.nextInt();
        int suma = 0;
        int pocisionDesigno = 0;
        String serie = " ";

        for (int i = 1; i <= N; i++) {
            if (pocisionDesigno <= 2) {
                suma += i;
                serie += " + " + i;
            } else {
                suma -= i;
                serie += " - " + i;
            }
            pocisionDesigno++;

            if (pocisionDesigno > 4) {
                pocisionDesigno = 0;

            }
        }
        System.out.println("serie: " + serie);
        System.out.println("su resultado es : " + suma);
        scanner.close();
    }

}

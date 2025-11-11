package repaso;
import java.util.Scanner;

public class Concatenacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el valor de N: "); 
        int n = scanner.nextInt();
        scanner.close();

        int s = 0;
        String serie = "";

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {// S=1+2−3+4+5−6+7+8−9+⋯+N
                s += i;
                serie += (-1 * i) + " + ";
            } else {
                s += i;
                serie += i + " + ";
            }
        }
        System.out.println("Serie: " + serie);
        System.out.println("Resultado: " + s);
    }
}

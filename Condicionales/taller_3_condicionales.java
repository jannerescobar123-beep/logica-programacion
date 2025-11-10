package condicionales_y_ciclos;
import java.util.Scanner;

public class taller_3_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nota = " ";

        System.out.println("ingrese su nota:");
        double numero = scanner.nextDouble();

        if (numero >= 9 || numero == 10) {
            nota += "a";

        } else if (numero >= 8 || numero == 8.9) {
            nota += "b";

        } else if (numero >= 7 || numero == 7.9) {
            nota += "c";

        } else if (numero >= 6 || numero == 6.9) {
            nota += "d";

        } else {
            nota += " f ";
        }
        System.out.println("su nota es: " + nota);
        scanner.close();
    }
}

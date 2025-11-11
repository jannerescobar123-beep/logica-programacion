package Condicionales;
import java.util.Scanner;

public class taller_8_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer digito:");
        int n1 = scanner.nextInt();

        System.out.println("ingrese el segundo digito:");
        int n2 = scanner.nextInt();

        System.out.println("ingrese el tercer digito:");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println(
                        "Numero Mayor " + n1 + "," + " Numero Intermedio " + n2 + "," + "  Numero Menor " + n3);
            } else {
                System.out
                        .println("Numero Mayor " + n1 + "," + " Numero Intermedio " + n3 + "," + " Numero Menor " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println(
                        "Numero Mayor: " + n2 + "," + " Numero Intermedio: " + n1 + "," + " Numero Menor: " + n3);
            } else {
                System.out.println(
                        "Numero Mayor: " + n2 + "," + " Numero Intermedio: " + n3 + "," + " Numero Menor: " + n1);
            }
        } else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println(
                        "Numero Mayor: " + n3 + "," + " Numero Intermedio: " + n1 + "," + " Numero Menor: " + n2);
            } else {
                System.out.println(
                        " Numero Mayor: " + n3 + "," + " Numero Intermedio: " + n2 + "," + " Numero Menor: " + n1);
            }
        }
        scanner.close();
    }
}

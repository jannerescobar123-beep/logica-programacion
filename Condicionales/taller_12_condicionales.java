package Condicionales;
import java.util.Scanner;

public class taller_12_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su ingreso anual:");
        int ingreso = scanner.nextInt();
        scanner.nextLine();

        int impuesto = 0;
        if (ingreso < 10000) {
            impuesto = (ingreso * 5) / 100;

        } else if (ingreso < 20000) {
            impuesto = (ingreso * 10) / 100;

        } else if (ingreso < 35000) {
            impuesto = (ingreso * 15) / 100;

        } else if (ingreso < 60000) {
            impuesto = (ingreso * 20) / 100;

        } else {
            impuesto = (ingreso * 25) / 100;
        }

        System.out.println("impuesto de renta a pagar: " + impuesto);

        scanner.close();
    }
}
    


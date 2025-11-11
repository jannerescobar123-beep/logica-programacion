import java.util.Scanner;

public class ciclos8_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 10000;
        int monto = 0;

        boolean finalizar = false;

        do {
            System.out.println("--Ingrese el monto que desea retirar--");
            monto = scanner.nextInt();

            if (monto < saldo) {
                saldo = saldo - monto;
                System.out.println("Se retiraron: $" + monto);
                System.out.println("Saldo disponible: " + saldo);
                System.out.println("¿Desea hacer otra operacion?");
                finalizar = true;
            } else {
                System.out.println("Error, el monto no debe superar el saldo disponible");
            }

        } while (!finalizar);

        scanner.close();
    }
}

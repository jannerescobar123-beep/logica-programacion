
import java.util.Scanner;

public class ejercisio9_taller5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Certificado? (si/no): ");
        String certificado = scanner.nextLine();
        System.out.println("¿Fuma? (si/no): ");
        String fuma = scanner.nextLine();
        System.out.println("¿Permiso? (si/no): ");
        String permiso = scanner.nextLine();

        if (certificado.equals("si") && fuma.equals("no") || permiso.equals("si")) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Rechazado");
        }scanner.close();
    }
}

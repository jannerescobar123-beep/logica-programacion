import java.util.Scanner;

public class ciclos12_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correo;
        boolean valido;

        do {
            System.out.print("Ingrese un correo electrónico: ");
            correo = sc.nextLine();

            valido = correo.contains("@") && correo.contains(".");

            if (!valido) {
                System.out.println("Correo inválido. Debe contener '@' y '.'. Intente de nuevo.");
            }

        } while (!valido);

        System.out.println("Correo válido: " + correo);
        sc.close();
    }
}

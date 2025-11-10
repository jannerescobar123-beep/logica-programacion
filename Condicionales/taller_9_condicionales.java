package condicionales_y_ciclos;
import java.util.Scanner;

public class taller_9_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        boolean larga = contraseña.length() >= 8;
        boolean tieneMayus = false;
        boolean tieneNume = false;
        boolean caracterEspa = false;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                tieneMayus = true;
            } else if (c >= '0' && c <= '9') {
                tieneNume = true;
            } else if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*') {
                caracterEspa = true;
            }
        }
        if (larga && tieneMayus && tieneNume && caracterEspa) {
            System.out.println("Su contraseña es segura ;)");
        } else {
            System.out.println("Su contraseña es insegura");
        }
        scanner.close();
    }
}

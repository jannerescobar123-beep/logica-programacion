package condicionales_y_ciclos;
import java.util.Scanner;

public class taller_5_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetirmenu = true;
        while (repetirmenu) {
            System.out.println("------- MENU -------");
            System.out.println("1. Saludar ");
            System.out.println("2. Despedirce ");
            System.out.println("3. salir ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Coordial saludo, usuario");
                    break;
                case 2:
                    System.out.println("Hasta pronto...");
                    repetirmenu = false;
                    break;
                case 3:
                    repetirmenu = false;
                    break;
                default:
                System.out.println("opcion no valida");
                    break;
            }
        }
        scanner.close();
    }
}

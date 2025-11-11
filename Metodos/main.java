package Metodos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;
        while (repetir) {
            System.out.println("");
            System.out.println("----------------    BIENVENIDO USUARIO      ----------------");
            System.out.println("----- 1.) CONVERTIR DE CELSIUS A KELVIN ");
            System.out.println("----- 2.) CONVERTIR DE CELSIUS A FAHRENHEIT");
            System.out.println("------3.) SALIR...");
            System.out.println("------------------------------------------------------------");
            System.out.println("");
            int opcion = scanner.nextInt();
            if (opcion == 3) {
                repetir = false;
                System.out.println("saliendo..");
                continue;
            }
            System.out.println("Ingrese la temperatura en grados Celsius:");
            double celsius = scanner.nextDouble();
            Proceso proceso = new Proceso();
            switch (opcion) {
                case 1:
                    double resultado = Proceso.convertirKelvin(celsius);
                    String mensajeFinal = Proceso.mensajeFinal(resultado);
                    Proceso.mostrarMensaje(mensajeFinal);
                    break;
                case 2:
                    resultado = Proceso.convertirAFahrenheit(celsius);
                    mensajeFinal = Proceso.mensajeFinal(resultado);
                    Proceso.mostrarMensaje(mensajeFinal);
                    break;
                default:
                    System.out.println("Opcion no permitida");
                    break;
            }
        }
        scanner.close();
    }
}

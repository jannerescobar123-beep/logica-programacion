import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {
            System.out.println("------Bienvenido al conversor de temperaturas------ \n");
            System.out.println("1.) Kelvin \n");
            System.out.println("2.) Fahrenheit \n");
            System.out.println("3.) Salir \n");
            System.out.println("--------------------------");

            int opcion = scanner.nextInt();
            if (opcion == 3) {
                repetir = false;
                System.out.println("Gracias por usar el conversor");
            }
            System.out.println("Ingrese la temperatura en Celsius");
            double Celsius = scanner.nextDouble();
            Temperatura temperatura = new Temperatura();
            switch (opcion) {
                case 1:
                    double resultado = temperatura.convertirAKelvin(Celsius);
                    String mensajeFinal = temperatura.mensajeFinal(resultado);
                    temperatura.mostrarMensaje(mensajeFinal);
                    break;

                case 2:
                    resultado = temperatura.convertirFahremheit(Celsius);
                    mensajeFinal = temperatura.mensajeFinal(resultado);
                    temperatura.mostrarMensaje(mensajeFinal);

                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }

        scanner.close();

    }
}

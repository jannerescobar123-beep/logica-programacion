 package metodos_funciones;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Repetir = true;

        while (Repetir) {
            System.out.println("");
            System.out.println("------------   | Que operacion desea aplicar |    --------------");
            System.out.println("Ingrese su nombre:");
            String nombre = scanner.nextLine();
            System.out.println("1.)     Suma");
            System.out.println("2.)     Resta");
            System.out.println("3.)     Multiplicacion");
            System.out.println("4.)     Divicion");
            System.out.println("5.)     Potencia");
            System.out.println("6.)     Salir");
            System.out.println("----------------------------------------------------------------");

            int opcion = scanner.nextInt();
            if (opcion== 6) {
                Repetir = false;
                System.out.println("Saliendo...");
                continue;
            }
            System.out.println("Ingrese el primer digito:");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo digito:");
            double num2 = scanner.nextDouble();
            operaciones operaciones = new operaciones();
            switch (opcion) {
                case 1:
                    double resultado = operaciones.sumar(num1, num2);
                    String mensajeFinal = operaciones.formatearMensaje(nombre, resultado);
                    operaciones.mostrarMensaje(mensajeFinal);
                    break;
                case 2:
                    resultado = operaciones.restar(num1, num2);
                    mensajeFinal = operaciones.formatearMensaje(nombre, resultado);
                    operaciones.mostrarMensaje(mensajeFinal);
                    break;
                case 3:
                    resultado = operaciones.multiplicar(num1, num2);
                    mensajeFinal = operaciones.formatearMensaje(nombre, resultado);
                    operaciones.mostrarMensaje(mensajeFinal);
                    break;
                case 4:
                    resultado = operaciones.dividir(num1, num2);
                    mensajeFinal = operaciones.formatearMensaje(nombre, resultado);
                    operaciones.mostrarMensaje(mensajeFinal);
                    break;
                case 5:
                    resultado = operaciones.potencia(num1, num2);
                    mensajeFinal = operaciones.formatearMensaje(nombre, resultado);
                    operaciones.mostrarMensaje(mensajeFinal);
                    break;
                    case 6:
                    resultado = operaciones.modulo(num1, num2);
                    mensajeFinal = operaciones.formatearMensaje(nombre, resultado);
                    operaciones.mostrarMensaje(mensajeFinal);
                    break;
                default:
                    System.out.println("Opcion no permitida");
                    break;
            }
        }
    }
}

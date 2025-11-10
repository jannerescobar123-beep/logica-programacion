package condicionales_y_ciclos;
import java.util.Scanner;

public class taller_7_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su primer digito: ");
        int n1 = scanner.nextInt();

        System.out.println("ingrese el segundo digito:");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingrese un operador (+, -, *, /)");
        String operador = scanner.nextLine();

        int resultado = 0;

        switch (operador) {
            case "+":
                resultado = n1 + n2;
                System.out.println("resultado " + resultado);
                break;
            case "-":
                resultado = n1 - n2;
                System.out.println("resultado " + resultado);
                break;
            case "*":
                resultado = n1 * n2;
                System.out.println("resultado " + resultado);
                break;
            case "/":
                if (n2 > 0) {
                    resultado = n1 / n2;
                    System.out.println("resultado " + resultado);
                } else {
                    System.out.println("se puede dividir entre cero (0)");
                }
                break;

            default:
                System.out.println("opcion no valida");
                break;
        }
        scanner.close();
    }
}
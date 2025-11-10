package condicionales_y_ciclos;
import java.util.Scanner;

public class taller_11_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer digito:");
        int lado1 = scanner.nextInt();

        System.out.println("ingrese el segundo digito:");
        int lado2 = scanner.nextInt();

        System.out.println("ingrese el tercer digito:");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado1 + lado3) > lado2) {
                System.out.println("Es un triangulo  EQUILÁTERO");
            } else {
                System.out.println("Las longitudes dadas no son forman un triangulo");
            }
        } else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2
                || lado2 == lado3 && lado2 != lado1) {
            System.out.println("Es un triangulo ISÓSCELES");
        } else {
            System.out.println("Es un triángulo ESCALENO");
        }
        scanner.close();
    }
}
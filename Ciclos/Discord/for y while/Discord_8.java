import java.util.Scanner;

public class Discord_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cree un programa que calcule el promedio de 10 números
        int contador = 0;
        double suma = 0;

        System.out.println("Ingrese 10 números:");

        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
            contador++;
        }

        double promedio = suma / 10;

        System.out.println("El promedio de los 10 números es: " + promedio);

        scanner.close();
    }
}
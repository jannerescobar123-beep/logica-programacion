import java.util.Scanner;

public class ciclos2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tabla de multiplicar con while: Pide un número al usuario y muestra su
        // tabla de multiplicar del 1 al 10.
        System.out.println("ingrese un numero para ver su tabla de multiplicar:");
        int numero = scanner.nextInt();

        int contador = 1;
        System.out.println("esta es la tabla del numero elegido: " + numero);
        while (contador <= 10) {
            System.out.println(numero + " * " + contador + " = " + (numero * contador));
            contador++;
        }
        scanner.close();
    }
}

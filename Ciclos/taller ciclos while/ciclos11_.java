import java.util.Scanner;

public class ciclos11_ {

    public static void main(String[] args) {
        System.out.println("Programa que muestra promedio de n numeros");
        Scanner entrada = new Scanner(System.in);

        int acumuladora = 0;
        int numero;
        int contadora = 0;
        double promedio = 0;

        do {
            System.out.println("Ingrese un numero");
            numero = entrada.nextInt();
            contadora = contadora + 1;
            acumuladora = acumuladora + numero;

            if (numero >= 0) {
                promedio = acumuladora / (double) contadora;
            }
        } while (numero >= 0);

        System.out.println("acmuladora valió: " + acumuladora);
        System.out.println("Gracias por usar mi programa");

        System.out.println("Promedio " + promedio);

        entrada.close();
    }
}

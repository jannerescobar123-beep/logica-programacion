import java.util.Scanner;

public class Discord_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Contador while: Mostrar los impares entre a y b, a>b
        System.out.println("ingrese el valor de (a), RECUERDA (a>b):");
        int a = scanner.nextInt();
        System.out.println("ingrese el valor de (b), RECUERDA (a>b):");
        int b = scanner.nextInt();
        int contador = a;
        while (contador >= b) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador--;
        }
        scanner.close();
    }
}

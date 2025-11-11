import java.util.Scanner;

public class ciclos6_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero al que le quiera sacar el factorial: ");
        int numero = scanner.nextInt();
        int contador = 1;
        int factorial =1;
        while (contador <= numero) {
            factorial = factorial * contador;
            contador++;
        }
        System.out.println("el factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
}

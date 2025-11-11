import java.util.Scanner;

public class ciclos4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do{
        System.out.println(" ingrese un numero:");
        numero = scanner.nextInt();
        } while( numero <= 0);
        System.out.println("has ingresado un numero positivo: " + numero);
        scanner.close();
    }
}

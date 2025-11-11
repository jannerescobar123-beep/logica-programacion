package repaso;
import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        int numero1 = scanner.nextInt();

        System.out.println("ingrese un numero:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2 ) {
            System.out.println("el numero: " + numero1 + " es mayor que el numero: " + numero2);
        }else{
            System.out.println("el numero: " + numero2 + " es mayor que el numero: " + numero1);
        } if (numero1 == numero2) {
            System.out.println("los dos numeros son iguales");
        }
        scanner.close();
    }
}

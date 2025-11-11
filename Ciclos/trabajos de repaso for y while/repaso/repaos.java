package repaso;
import java.util.Scanner;

public class repaos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero al que quiera saber si es primo o no");
        int numero = scanner.nextInt();
        boolean esPrimo = true;
        if (numero < 2) {
            esPrimo = false;
        }
        for ( int i = 2; i * i <= numero; i ++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if ( esPrimo){
            System.out.println("el numero " + numero + " es primo");
        } else {
            System.out.println("el numero " + numero + " no es primo");
        }
        scanner.close();
    }
}

package repaso;
import java.util.Scanner;
public class repaos2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.println("ingrese un numero:");
        int n = scanner.nextInt();
        for(int i = 1 ; i < n; i +=2 )
        if ( n % 2  == 0 ) {
            contador++;
        }
        scanner.close();
        System.out.println("el numero de pares son "+ contador);
    }
}

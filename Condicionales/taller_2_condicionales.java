package Condicionales;
import java.util.Scanner;
public class taller_2_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" digite un numero entero:");
        int entero = scanner.nextInt();

        if (entero % 2 == 0 ) {
            System.out.println("el numero digitado es  par");
            
        }else{
            System.out.println("el numero digitado es impar");
        }
        scanner.close();
    }
}
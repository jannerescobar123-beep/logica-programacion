package Condicionales;
import java.util.Scanner;

public class taller_6_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el año para verificar:");
        int año = scanner.nextInt();
        if (año % 4 == 0){
            System.out.println(" el año ingresado es bisiesto");
        }else{
            System.out.println("el año ingresado no es bisiesto");
        }
        scanner.close();
    }
}

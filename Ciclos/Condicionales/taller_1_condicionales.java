package Condicionales;
import java.util.Scanner;
public class taller_1_condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 40) {
            System.out.println("es mayor de edad");
            
        }else{
            System.out.println("es menor de edad");
        }
        scanner.close();
    }
    
    
    
}

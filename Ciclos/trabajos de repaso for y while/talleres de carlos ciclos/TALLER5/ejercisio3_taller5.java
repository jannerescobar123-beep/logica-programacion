

import java.util.Scanner;

public class ejercisio3_taller5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("cuantos años de experiencia tiene:");
        int años = scanner.nextInt();

        if (edad > 25 && años >= 5 || edad >30) {
            System.out.println(" obtiene licencia especial");
        }else{
            System.out.println("no obtiene licencia");
        }scanner.close();

    }
    
}

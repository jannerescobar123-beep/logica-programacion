


import java.util.Scanner;

public class ejercisio4_taller5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su promedio:");
        int promedio = scanner.nextInt();

        System.out.println("ingrese su estrato:");
        int estrato = scanner.nextInt();

        if (promedio >= 90 && estrato <= 2 || promedio >= 95) {
            System.out.println(" obtiene beca");
        }else{
            System.out.println("no obtiene beca");
        }scanner.close();

    }
    
}

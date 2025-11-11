

import java.util.Scanner;

public class ejercisio1_taller5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su compra: ");
        int compra = scanner.nextInt();

        System.out.print("cliente frecuente: (true/false) : ");
        String frecuente = scanner.next().toLowerCase();

        if (compra > 100 && frecuente.equals("si") || (compra >200)) {
            System.out.println(" 20% de descuento ");
        }else{
            System.out.println("no obtiene descuento");
        } scanner.close();


        

    }

    

    
    
}

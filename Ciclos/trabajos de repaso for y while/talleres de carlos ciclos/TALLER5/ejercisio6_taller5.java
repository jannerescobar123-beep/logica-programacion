
import java.util.Scanner;

public class ejercisio6_taller5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("su dia de compra es ¿lunes o viernes?");
    String dia = scanner.nextLine();

    System.out.println("¿tarjeta? (si/no): ");
    String tarjeta = scanner.nextLine();

    System.out.println("su compra es de:");
    int compra = scanner.nextInt();

    if (compra >= 50 && dia.equals("lunes") || (dia.equals("viernes") || tarjeta.equals("si" ))) {
        System.out.println("participa");
    }else{
        System.out.println("no participa");
    }
scanner.close();
    
    }
}



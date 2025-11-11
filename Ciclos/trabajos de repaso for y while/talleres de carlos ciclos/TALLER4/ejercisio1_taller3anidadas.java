package TALLER4;
import java.util.Scanner;
public class ejercisio1_taller3anidadas {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("¿sabe nadar?");
        String sabeNadar = Scanner.nextLine();
        System.out.println("¿que edad tiene?");
        int queEdadtiene = Scanner.nextInt();

        if (queEdadtiene >=18) {
            if (sabeNadar.equals("si")) {
                System.out.println("puede ingresar a la piscina");
            }else{
                System.out.println(" debe utilizar flotador");
            }
        
        }else{
            System.out.println("debe ir acompañado");
        } Scanner.close();
        



    
        

    }
}   


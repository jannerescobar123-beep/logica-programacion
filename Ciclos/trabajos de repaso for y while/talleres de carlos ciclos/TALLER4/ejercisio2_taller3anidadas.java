package TALLER4;
import java.util.Scanner;
public class ejercisio2_taller3anidadas {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("¿tiene dinero?");
        String tieneDinero = Scanner.nextLine();
        System.out.println("¿que edad tiene?");
        int queEdadtiene = Scanner.nextInt();

        if (queEdadtiene >=15) {
            if (tieneDinero.equals("si")) {
                System.out.println("puedes comprar tu entrada");
            }else{
                System.out.println("no puedes entrar, no tienes dinero");
            }
        
        }else{
            System.out.println("debe ir acompañado por un adulto");
        } Scanner.close();
        



    
        

    }
}   



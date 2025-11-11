package TALLER4;
import java.util.Scanner;

public class ejercisio5_taller3anidadas {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("ingrese su asuario");
        String usuario = Scanner.nextLine();

        System.out.println("ingrese su contraseña");
        int contraseña = Scanner.nextInt();

        if (usuario.equals("admin")) {
            if (contraseña ==1234) {
            System.out.println(" bienvenido admin");
            }else{
                System.out.println("contraseña incorrecta");
            }
        }else{
            System.out.println(" usuario no autorizado");
        }
Scanner.close();
    }
    
}

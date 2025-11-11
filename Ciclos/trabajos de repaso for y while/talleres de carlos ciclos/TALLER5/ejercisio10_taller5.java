
import java.util.Scanner;

public class ejercisio10_taller5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("digite sus ingresos:");
        int ingresos = scanner.nextInt();

        System.out.println("ingrese los años de trabajo estable:");
        int años = scanner.nextInt();

        if (ingresos >= 2000 && años >= 2 || ingresos > 5000) {
            System.out.println("obtiene su prestamo!");
        }else{
            System.out.println("no tiene su prestamo");
        }scanner.close();

    }
    
}

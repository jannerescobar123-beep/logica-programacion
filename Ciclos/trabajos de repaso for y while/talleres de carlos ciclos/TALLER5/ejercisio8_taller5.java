
import java.util.Scanner;

public class ejercisio8_taller5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese sus meses en la compañia:");
        int meses = scanner.nextInt();

        System.out.println("ingrese la cantidad de datos:");
        int datos = scanner.nextInt();

        if (meses > 12 && datos > 10 || meses > 24) {
            System.out.println("aplica");
        }else{
            System.out.println("no aplica");
        }scanner.close();

    }
    
}
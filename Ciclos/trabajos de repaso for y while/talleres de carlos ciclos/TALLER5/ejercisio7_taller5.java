
import java.util.Scanner;

public class ejercisio7_taller5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su rating:");
        int rating = scanner.nextInt();

        System.out.println("ingrese su edad:");
        int edad = scanner.nextInt();

        if (rating > 1800 && edad > 15 || rating > 2000) {
            System.out.println("puede inscribirse");
        }else{
            System.out.println("no puede inscribirse");
        }scanner.close();

    }
    
}

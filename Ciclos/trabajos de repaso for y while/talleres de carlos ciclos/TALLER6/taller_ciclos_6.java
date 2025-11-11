package TALLER6;
import java.util.Scanner;

public class taller_ciclos_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba una palabra:");
        String palabra = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println(palabra);
        }
        scanner.close();
    }
}

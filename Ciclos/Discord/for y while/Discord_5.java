import java.util.Scanner;
public class Discord_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Contador while: Imprime los números del 60 al 10.
        int contador = 60;
        while (contador >= 10) {
            System.out.println(contador);
            contador--;
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class ciclos3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ingrese un numero que desee hacer cuanta regresiva:");
        int a = scanner.nextInt();
        int contador = a;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
        scanner.close();
    }
}

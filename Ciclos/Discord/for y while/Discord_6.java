import java.util.Scanner;
public class Discord_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Contador while: Imprime los números entre a y b , con a > b
        System.out.println("ingrese el valor de (a), RECUERDA (a>b):" );
        int a = scanner.nextInt();
        System.out.println("ingrese el valor de (b), RECUERDA (a>b):" );
        int b = scanner.nextInt();
        int contador = a;
        System.out.println("los numero entre el " + a + " y " + b + " son:");
        while (contador >= b) {
            System.out.println(contador);
        contador--;
        }
        scanner.close();
    }
}

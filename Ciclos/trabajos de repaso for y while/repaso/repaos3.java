package repaso;
import java.util.Scanner;
public class repaos3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String serie = "";
        System.out.println("ingrese un numero: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++ ){
            suma = suma + i;
            serie += " + " + i;
            
        }
        System.out.println("la serie es :" + serie);
        System.out.println("el resultado es : " + suma);
        scanner.close();
    }
}

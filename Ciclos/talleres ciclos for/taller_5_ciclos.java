package condicionales_y_ciclos;
import java.util.Scanner;

public class taller_5_ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serie = " ";
        int multi = 1;
        
        System.out.println(" ingrese un numero:" );
        int n = scanner.nextInt();

        for( int i = 1; i <= n; i++){
            if (i == n) {
                serie += i;
            }else{
                serie += i + " x ";
            }
            multi = multi * i;
        }
        System.out.println("la opercaion factorial: " + serie );
        System.out.println(" el resultado es : " + multi);
        scanner.close();
    }
}
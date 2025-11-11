package repaso;
import java.util.Scanner;

public class repaos4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int suma = 0;
        String serie = "";
        int contador = num;
        while (num != 0) {
            System.out.println("ingrese un numero nuevamente");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println(" HASTA ACA LLEGAS PERR@");
                suma = suma + num;
                serie += " + " + num;
            }
            contador++;
        }
        System.out.println("los numero puestos son" + serie);
        System.out.println("el resultado es :" + suma);
    }
}

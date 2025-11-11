package condicionales_y_ciclos;
import java.util.Scanner;

public class taller_4_ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String rango = " ";

        System.out.println("ingrese el primer digito (inicio):");
        int numero1 = scanner.nextInt();

        System.out.println("ingrese el segundo digito (final)");
        int numero2 = scanner.nextInt();
        for(int i = numero1; i <= numero2 ; i++){
        suma = suma + i;
        rango += " + " + i;
        }
        System.out.println("la suma es: " + rango);
        System.out.println(" el resultado es: " + suma);
        scanner.close();

    }
}

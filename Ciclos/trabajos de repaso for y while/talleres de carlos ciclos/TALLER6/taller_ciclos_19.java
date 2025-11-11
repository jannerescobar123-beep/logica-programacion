package TALLER6;
import java.util.Scanner;

public class taller_ciclos_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor de la serie: ");
        int N = scanner.nextInt();
        double suma = 0.0;
        scanner.close();

        System.out.print(" S =  ");
        for (int i = 1; i <= N; i++) { // S = 2/3 + 4/5 + 6/7 + 8/9 + …+(N*2)/(N*2 + 1)
            double termino = (i * 2.0) / (i * 2.0 + 1.0);
            suma += termino;

            System.out.print((i * 2.0) + "/" + (i * 2.0 + 1.0 ));
            if (i < N) {
                System.out.print(" + ");
            }
        }
        System.out.println();
        System.out.println(" el resultado de la suma es:" + suma);


    }

}

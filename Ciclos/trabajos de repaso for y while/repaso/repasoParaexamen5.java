package repaso;
import java.util.Scanner;

public class repasoParaexamen5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese el valor de N: ");
        int N = scanner.nextInt();
        scanner.close();

        String serie = " ";
        int suma = 0;
        int limitePosi = 1;
        int numeroPosi = 0;
        int limiteNega = 1;
        int numeroNega = 0;

        for (int i = 3; i <= N; i = i + 3) {
            if (numeroNega < limiteNega) {
                serie = serie + " - " + i;
                suma = suma - i;
                numeroNega++;

            }else{
                serie = serie + " + " + i;
                suma = suma + i;
                numeroPosi ++;
            }
            if (numeroPosi == limitePosi){
                numeroNega = 0;
                numeroPosi = 0;
                limiteNega++;
                limitePosi ++;
            }
        }
        System.out.println("S= " + serie);
        System.out.println("el resultado es: " + suma);
    }

}

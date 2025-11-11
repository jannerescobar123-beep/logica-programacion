package repaso;
import java.util.Scanner;
public class repasoParaexamen3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese el valor de N: ");
        int N = scanner.nextInt();
        scanner.close();
        String serie = " ";
        int suma = 0;
        int limitePosi = 3;
        int numeroPosi = 0;
        int limiteNega = 1;
        int numeroNega = 0;

        for(int i = 1; i <= N; i++){
            if (numeroPosi < limitePosi) {
                suma = suma + i;
                serie = serie + " + " + i;
                numeroPosi = numeroPosi + 1;
            }else{
                suma = suma - i;
                serie = serie + " - " + i;
                numeroNega = numeroNega + 1;
            }
            if (numeroNega == limiteNega){
                numeroNega = 0;
                numeroPosi = 0;
            }
        }

        System.out.println(" la serie es " + serie );
        System.out.println(" el resultado es: " + suma);
    }
    
}

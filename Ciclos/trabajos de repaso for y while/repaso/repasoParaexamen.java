package repaso;
import java.util.Scanner;

public class repasoParaexamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese el valor N :");
        int N = scanner.nextInt();
        scanner.close();
        int resultado = 0;
        int limitePosi = 2;
        int contadorPosi = 0;
        int limiteNega = 1;
        int contadorNega = 0;
        String serie = " ";
        for (int i = 0; i <= N; i = i + 1) {
            if (contadorPosi < limitePosi) {
                serie = serie + " + " + i;
                resultado = resultado + i;
                contadorPosi = contadorPosi + 1;
            } else {
                serie = serie + " - " + i;
                resultado = resultado - i;
                contadorNega = contadorNega + 1;
            }
            if (contadorNega == limiteNega) {
                contadorNega = 0;
                contadorPosi = 0;
                
            }
        }
        System.out.println("S = " + serie + " el resultado es: " + resultado  );
    }

}

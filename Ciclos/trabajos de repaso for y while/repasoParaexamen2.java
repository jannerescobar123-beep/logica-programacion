package repaso;
import java.util.Scanner;
public class repasoParaexamen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ingrese el valor de N: ");
        int N = scanner.nextInt();
        scanner.close();
        int resultado = 0;
        String serie = " ";
        int limiteNega = 2;
        int limitePosi = 2;
        int contadorNega = 0;
        int contadorPosi = 0;

        for(int i = 1 ; i <= N; i++ ){
            if (contadorNega < limiteNega) {
                serie += " - " + i;
                resultado -= i;
                contadorNega += 1;
            }else{
                serie += " + " + i;
                resultado += i;
                contadorPosi += 1;
            }
            if (contadorNega == limiteNega && contadorPosi == limitePosi) {
                contadorNega = 0;
                contadorPosi = 0;
            }
            
        }
        System.out.println(" S= " + serie);
        System.out.println(" El resultado es : " + resultado);
    }
    
}

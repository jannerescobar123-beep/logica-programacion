package repaso;
import java.util.Scanner;

public class repaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valir de N:");
        int N = scanner.nextInt();
        scanner.close();
        int limiteNega = 2;
        int limitePosi = 1;
        int contadorNega = 0;
        int contadorPosi = 0;
        String serie = " ";
        for(int i = 2; i <= N; i = i + 2){
            if (contadorNega < limiteNega) {
                serie = serie + " - " + i;
                contadorNega += i ;
                
            }else{
                serie = serie + " + " + i;
                contadorPosi++;
                
            }
            if (contadorPosi == limitePosi){
                contadorPosi = 0;
                contadorNega = 0;
                limitePosi ++;
            }
        }
        System.out.println(serie);


    }
    
}

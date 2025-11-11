package repaso;

import java.util.Scanner;

public class Concatenacion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor de N:");
        int N = scanner.nextInt();

        int suma = 0;
        int pocision = 1;
        String serie = " ";

        for(int i = 1 ; i <= N ; i = i + 2){
            if (pocision <= 3) {
                suma += i;
                serie += " + " + i;
            }else{
                suma -= i;
                serie += " - " + i;
            }
            pocision = pocision + 1;
            if (pocision > 5) {
                pocision = 1;
                
            }
        }
        System.out.println(" serie: " + serie);
        System.out.println("la suma de la serie es :" + suma);
        scanner.close();
    }
    
}
//+ 1 + 3 + 5 - 7 - 9 + 11 + 13 + 15 - 17 - 19
// 3 positivos 2 negfativos impares
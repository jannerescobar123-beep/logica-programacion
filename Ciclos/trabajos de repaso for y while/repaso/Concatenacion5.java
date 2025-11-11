package repaso;
import java.util.Scanner;
public class Concatenacion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //S=1−3+5−7+9−11+13−15+⋯+N 
        System.out.println("ingrese el valor de N:");
        int n = scanner.nextInt();
        scanner.close();
        int suma = 0;
        int pocision = 1;
        String serie = " ";
        for(int i = 1 ; i <= n ; i = i + 2){
            if (pocision % 2 != 0){
                suma += i;
                serie += " + " + i;
                
            }else{
                suma -= i;
                serie += " - " + i;
            }
            pocision++;

        }
        System.out.println(" serie: " + serie);
        System.out.println("la suma de la serie es :" + suma);


    }
    
}
//S = 1 − 3 + 5 − 7 + 9 − 1 1 + 1 3 − 1 5 + ⋯ + N 
// 1 positivo 1 negativo impares 

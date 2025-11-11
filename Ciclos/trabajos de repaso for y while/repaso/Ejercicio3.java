package repaso;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int N = sc.nextInt();

        int suma = 1;        // empezamos con el primer número
        String serie = "1";  // iniciamos la serie con "1"
        int pos = 2;         // ya usamos la posición 1 con el número 1

        for (int i = 2; i <= N; i++) {
            if (pos <= 2) {          // primeras 2 posiciones → suma
                suma += i;
                serie += " + " + i;
            } else {                 // siguientes 2 posiciones → resta
                suma -= i;
                serie += " - " + i;
            }

            pos++;
            if (pos > 4) {           // reiniciar el patrón
                pos = 1;
            }
        }

        System.out.println("Serie: " + serie);
        System.out.println("La suma de la serie es: " + suma);

        sc.close();
    }
}

// 1 + 2 - 3 - 4 + 5 + 6 - 7 - 8 + 9 + 10
// 2 positivos 2 negativos
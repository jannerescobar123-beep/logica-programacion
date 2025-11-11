import java.util.Scanner;

public class ciclos5_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                System.out.println(contador);
                suma = suma + contador;
            }
            contador++;
        }
        System.out.println("la suma de estos numeros es de: " + suma);
        scanner.close();
    }
}

import java.util.Scanner;

public class Discord_2 {

    public static void main(String[] args) {
        
        // acumuladora
        int operacion = 1;
        String operacionTexto = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = sc.nextInt();
        sc.close();

        for (int i = 5; i > 0; i--) {
            operacion = operacion * i;
            // operacionTexto+= i + "*";
            System.out.println("Operacion vale: " + operacion);
        }
        System.out.println(operacionTexto + " = " + operacion);
    }

}

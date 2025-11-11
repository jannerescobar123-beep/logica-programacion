package repaso;
import java.util.Scanner;

public class contar_vocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una palabra:");
        String palabra = sc.nextLine();

        int contador = 0;

        System.out.println("la palabra  a desglosar es: " + palabra);

        for (int i = 0; i < palabra.length(); i++) {
            char letras = palabra.charAt(i);
            
            if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
                contador++;
            }
            System.out.println("el resultado es : " + letras);
        }
        System.out.println("el total de vocales es:" + contador);
        sc.close();
    }
}

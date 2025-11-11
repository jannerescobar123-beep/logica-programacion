package repaso;
import java.util.Scanner;

public class invertir_palabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese una palabra:");
        String palabra = scanner.nextLine();

        int contador = 0;
        String invertir = " ";

        System.out.println("La palabra  a desglosar es: " + palabra);

        for (int i = 0; i < palabra.length(); i++) {
            char letras = palabra.charAt(i);
            
            invertir = letras + invertir;
            if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u'|| letras == 'A' || letras == 'E' || letras == 'I' || letras == 'O' || letras == 'U') {
                contador++;
            }
            System.out.println("- El resultado es : " + letras);
        }
        if (palabra.equalsIgnoreCase(invertir)) {
            System.out.println("- La palabra es palindromo ");
        } else {
            System.out.println("- No es palindromo");
        }
        System.out.println("- La palabra invertida es: " + invertir);
        System.out.println("- El total de vocales es:" + contador);
        scanner.close();
    }
}

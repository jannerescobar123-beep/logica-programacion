package repaso;
import java.util.Scanner; 
public class mostrar_pala {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("la palabra  a desglosar es: " + palabra);
        for(int i = 0; i < palabra.length(); i++){
            char letras = palabra.charAt(i);
            System.out.println("el resultado es : " + letras);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class ciclos13_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una palabra: ");
        String frase = sc.nextLine();

        int i = 0;
        int contador = 0;
        
        while (i < frase. length() ) {
            char c = frase.charAt(i);
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4') {
                contador++;
            }
            i++;
        }
        System.out.println("su palabra tiene : " + contador + " vocal(les) ");
        sc.close();
    }
}

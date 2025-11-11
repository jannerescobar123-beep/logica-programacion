import java.util.Scanner;

public class Discord_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        String numero = scanner.nextLine();
        int contadorPares = 0;

        for (int i = 0; i < numero.length(); i++) {
            char cadena = numero.charAt(i);

            int digito = Character.getNumericValue(cadena);

            if (digito % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("el numero " + numero + " contiene " + contadorPares + " digitos pares.");
        scanner.close();
    }
}

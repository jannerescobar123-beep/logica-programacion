/*Crear un programa que recorra una cadena y muestre otra cadena que contenga todas las letras a que hay en ella. Por ejemplo, 
si la cadena es "Sena" ---> debe mostrar "a" porque solo existe una a,
 si la acadena es "alegria" ----> debe mostrar "aa" porque existen dos letras a etc */

import java.util.Scanner;

public class Discord_14 {
    public static void main(String[] args) {
        String cadena;
        String acomulador = "";

        Scanner snr = new Scanner(System.in); 
        System.out.println("Ingrese una cadana de texto:");
        cadena = snr.nextLine();
        snr.close();

        for(int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if (letra == 'a') {
                acomulador += letra;
            }
        }
        System.out.println(acomulador);
    }
}
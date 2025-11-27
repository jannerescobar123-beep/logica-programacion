package Arreglos.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class nivelBasico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character>caracter = new ArrayList<>();
        caracter.add('a');
        caracter.add('e');
        caracter.add('i');
        caracter.add('o');
        caracter.add('u');
        int contadorA = 0 ;
        int contadorE = 0 ;
        int contadorI = 0 ;
        int contadorO = 0 ;
        int contadorU = 0 ;
        System.out.println("INGRESE EL TEXTO:");
        String texto = sc.nextLine();
        for(int i = 0; i < caracter.size();i++){
            char letras = caracter.get(i);
            if (letras == 'a') {
                contadorA++;
            } else if (letras == 'e') {
                contadorE++;
            } else if (letras == 'i') {
                contadorI++;
            } else if (letras == 'o') {
                contadorO++;
            }else if (letras == 'u') {
                contadorU++;
            }
        }


    }
}

package TALLER6;
import java.util.Scanner;

public class taller_ciclos_4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println(" ingrese un numero de su pais:");
      int numero = scanner.nextInt();
      String resultado = "";
      switch (numero) {
         case 1:
            resultado = "Colombia";
            break;
         case 2:
            resultado = "Venezuela";
            break;
         case 3:
            resultado = "Brazil";
            break;
         case 4:
            resultado = "Ecuador";
            break;
         case 5:
            resultado = "Peru";
            break;
         case 6:
            resultado = "Bolivia";
            ;
            break;
         case 7:
            resultado = "Chile";
            break;
         case 8:
            resultado = "Argentina";
            break;
         case 9:
            resultado = "Uruguay";
            break;
         case 10:
            resultado = "Paraguay";
            break;
         default:
            resultado += "";
            break;

      }
      scanner.close();
      System.out.println("Su  gentilicio es: " + resultado);
   }
}
import java.util.Scanner;

public class Discord_4{

    public static void main(String[] args) {

        int numIncio;
        int numFin;
        int suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero para iniciar la suma:");
        numIncio = sc.nextInt();
        System.out.println("Ingrese un número para finalizar la suma:");
        numFin = sc.nextInt();
        sc.close();

        for (int i = numIncio; i <= numFin; i++) {
            //sumaTexto += i + "+";
            suma = suma +  i;
            System.out.println(suma);
        }
        //System.out.println(sumaTexto);
        System.out.println(suma);
    }

}
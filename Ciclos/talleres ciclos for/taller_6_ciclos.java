

import java.util.Scanner;

public class taller_6_ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serie = " ";
        int resultado = 1;

        System.out.println(" ingrese una base :");
        int operario1 = scanner.nextInt();

        System.out.println("ingrese ul exponente:");
        int operario2 = scanner.nextInt();

        if (operario1 != 0) {
            for (int i = 1; i <= operario2; i++) {
                if (i == operario2) {
                    serie += operario1;
                } else {
                    serie += operario1 + " x ";
                }
                resultado = operario1 + resultado;
            }
            System.out.println("serie: " + serie);
            System.out.println("total: " + resultado);
        }else{
            System.out.println("no puede ser un numero diferente a cero");
        }
        scanner.close();
    }
}

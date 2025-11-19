import java.util.Scanner;

public class Ingresos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Crear un programa que guarde para el usuario sus ingresos diarios durante 7
         * días y al final muestre:
         * el promedio del salario , el ingreso menor y el ingreso mayor.
         * Los ingresos deben ser dados por el usuario
         */
        int ingresosDia[] = new int[7];
        boolean menu = true;
        int ingresoMenor = 0;
        int ingresoMayor = 0;
        double promedio = 0;

        while (menu){
            
        System.out.println("------------    bienvenido al sistema de ingresos diarios       ------------");
        System.out.println("------------    que opvcion desea realizar      ------------");
        System.out.println("1. Ingresar ingresos diarios");
        System.out.println("2. mostar promedio de ingresos");
        System.out.println("3. mostrar ingreso menor");
        System.out.println("4. mostrar ingreso mayor");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                for (int i = 0; i < ingresosDia.length; i++) {
                    System.out.println("Dijite el ingreso del dia " + (i + 1));
                    ingresosDia[i] = sc.nextInt();
                }
                break;
            case 2:
                double suma = 0;
                for (int i = 0; i < ingresosDia.length; i++) {
                    suma += ingresosDia[i];
                }
                promedio = suma / ingresosDia.length;
                System.out.println("el promedio de ingresos es: " + promedio);
                break;
            case 3:
                ingresoMenor = ingresosDia[0];
                for (int i = 1; i < ingresosDia.length; i++) {
                    if (ingresosDia[i] < ingresoMenor) {
                        ingresoMenor = ingresosDia[i];
                    }
                    System.out.println("el ingreso menor es: " + ingresoMenor);
                }
                break;
            case 4:
                ingresoMayor = ingresosDia[0];
                for (int i = 1; i < ingresosDia.length; i++) {
                    if (ingresosDia[i] > ingresoMayor) {
                        ingresoMayor = ingresosDia[i];
                    }
                }
                System.out.println("el ingreso mayor es: " + ingresoMayor);
                break;

            default:
                System.out.println("opcion no valida");
        }
        sc.close();
        }
    }
}
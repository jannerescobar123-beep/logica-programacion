package TALLER6;
import java.util.Scanner;

public class taller_ciclos_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de centena: ");
        int centena = scanner.nextInt();

        System.out.println("Ingrese el numero de decena: ");
        int decena = scanner.nextInt();

        System.out.println("Ingrese el numero de unidad: ");
        int unidad = scanner.nextInt();

        scanner.close();

        String resultado = "";
        switch (centena) {
            case 1:
                resultado += "Ciento";
                break;
            case 2:
                resultado += "Doscientos";
                break;
            case 3:
                resultado += "Trescientos";
                break;
            case 4:
                resultado += "Cuatrocientos";
                break;
            case 5:
                resultado += "Quinientos";
                break;
            case 6:
                resultado += "Seiscientos";
                break;
            case 7:
                resultado += "Setecientos";
                break;
            case 8:
                resultado += "Ochocientos";
                break;
            case 9:
                resultado += "Novecietos";
                break;

            default:
                resultado = "";
                break;
        }

        switch (decena) {
            case 1:
                resultado += " diez";
                break;
            case 2:
                resultado += " veinte";
                break;
            case 3:
                resultado += " treinta";
                break;
            case 4:
                resultado += " cuarenta";
                break;
            case 5:
                resultado += " cincuenta";
                break;
            case 6:
                resultado += " sesenta";
                break;
            case 7:
                resultado += " setenta";
                break;
            case 8:
                resultado += " ochenta";
                break;
            case 9:
                resultado += " noventa";
                break;
            default:
                resultado += "";
                break;
        }
        switch (unidad) {
            case 1:
                resultado += " y uno";
                break;
            case 2:
                resultado += " y dos";
                break;
            case 3:
                resultado += " y tres";
                break;
            case 4:
                resultado += " y cuatro";
                break;
            case 5:
                resultado += " y cinco";
                break;
            case 6:
                resultado += " y seis";
                break;
            case 7:
                resultado += " y siete";
                break;
            case 8:
                resultado += " y ocho";
                break;
            case 9:
                resultado += " y nueve";
                break;
            default:
                resultado += "";
                break;
        }
        System.out.println("Número: " + resultado);

    }

}

package TALLER6;
import java.util.Scanner;

public class taller_ciclos_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia de su cumple años: ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes de su cumple años: ");
        int mes = scanner.nextInt();

        scanner.close();

        String resultado = "";
        switch (dia) {
            case 1:
                resultado += "1";
                break;
            case 2:
                resultado += "2";
                break;
            case 3:
                resultado += "3";
                break;
            case 4:
                resultado += "4";
                break;
            case 5:
                resultado += "5";
                break;
            case 6:
                resultado += "6";
                break;
            case 7:
                resultado += "7";
                break;
            case 8:
                resultado += "8";
                break;
            case 9:
                resultado += "9";
                break;
            case 10:
                resultado += "10";
                break;
            case 11:
                resultado += "11";
                break;
            case 12:
                resultado += "12";
                break;
            case 13:
                resultado += "13";
                break;

            case 14:
                resultado += "14";
                break;
            case 15:
                resultado += "15";
                break;
            case 16:
                resultado += "16";
                break;
            case 17:
                resultado += "17";
                break;
            case 18:
                resultado += "18";
                break;
            case 19:
                resultado += "19";
                break;
            case 20:
                resultado += "20";
                break;
            case 21:
                resultado += "21";
                break;
            case 22:
                resultado += "22";
                break;
            case 23:
                resultado += "23";
                break;
            case 24:
                resultado += "24";
                break;
            case 25:
                resultado += "25";
                break;
            case 26:
                resultado += "26";
                break;
            case 27:
                resultado += "27";
                break;
            case 28:
                resultado += "28";
                break;
            case 29:
                resultado += "29";
                break;
            case 30:
                resultado += "30";
                break;
            case 31:
                resultado += "31";
                break;

            default:
                resultado = "";
                break;
        }

        switch (mes) {
            case 1:
                resultado += " enero";
                break;
            case 2:
                resultado += " febrero";
                break;
            case 3:
                resultado += " marzo";
                break;
            case 4:
                resultado += " abril";
                break;
            case 5:
                resultado += " mayo";
                break;
            case 6:
                resultado += " junio";
                break;
            case 7:
                resultado += " julio";
                break;
            case 8:
                resultado += " agosto";
                break;
            case 9:
                resultado += " septiembre";
                break;
            case 10:
                resultado += " octubre";
                break;
            case 11:
                resultado += " noviembre";
                break;
            case 12:
                resultado += " diciembre";
                break;
            default:
                resultado += "de";
                break;
        }
        System.out.println("su cumple años es el " + resultado);
    }
}
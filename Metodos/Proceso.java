package Metodos;

public class Proceso {
    public static double convertirAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static double convertirKelvin(double celsius){
        return celsius + 273.15; 
    }
    public  static String mensajeFinal(double celsius) {
        return " Su resultado es " + celsius;
    }
    public  static void mostrarMensaje(String resultado) {
        System.out.println(resultado);
    }
}

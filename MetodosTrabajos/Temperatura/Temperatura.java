public class Temperatura {
    public double convertirFahremheit(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }

    public double convertirAKelvin(double Celsius) {
        return Celsius + 273.15;
    }

    public void mostrarMensaje(String resultado) {
        System.out.println(resultado);
    }

    public String mensajeFinal(double Celsius) {
        return "Su resultado es  " + Celsius; 
    }

    
}

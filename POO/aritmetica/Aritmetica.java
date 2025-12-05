package POO.aritmetica;

public class Aritmetica {
    public double suma (double a, double b){
        return a + b;
    }
    public double resta (double a, double b){
        return a - b;
    }
    public double multiplicacion (double a, double b){
        return a * b;
    }
    public double division (double a, double b){
        if (b != 0){
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }
}

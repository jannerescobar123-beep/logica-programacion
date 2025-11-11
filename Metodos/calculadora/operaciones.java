package metodos_funciones;
public class operaciones {
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("División por cero no permitida.");
            return 0;
        }
    }

    public double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public String formatearMensaje(String nombre, double resultado) {
        return "Hola " + nombre + " Su resultado es " + resultado;
    }

    public void mostrarMensaje(String resultado) {
        System.out.println(resultado);
    }
}

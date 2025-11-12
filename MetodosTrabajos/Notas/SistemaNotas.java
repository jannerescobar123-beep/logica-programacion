package MetodosTrabajos.Notas;

public class SistemaNotas {
    public static double calcularPromedio(double sumaNotas, int cantidadNotas) {
        return sumaNotas / cantidadNotas;
    }
    public static void mostrarMensaje(double promedio) {
        if (promedio >= 3.0) {
            System.out.println("Ha aprobado con un promedio de: " + promedio);
        } else {
            System.out.println("Has reprobado con un promedio de: " + promedio);
        }
    }
}

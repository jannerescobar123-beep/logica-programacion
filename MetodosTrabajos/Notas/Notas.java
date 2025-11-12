package MetodosTrabajos.Notas;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0.0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("ingrese sus notas" + i);
            double nota = scanner.nextDouble();
            sumaNotas += nota;
        }
        double promedio = SistemaNotas.calcularPromedio(sumaNotas, 3);
        SistemaNotas.mostrarMensaje(promedio);
        scanner.close();
    }
}

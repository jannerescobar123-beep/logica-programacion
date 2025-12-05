/*Crear una aplicación con una clase principal Operar, la cual use dos clases, Aritmetica y Mensajeria
La clase Aritmetica debe tener métodos para las operaciones básicas.
La clase Mensajeria debe tener métodos para mostrar resultados de operaciones, bienvenida al usuario y despedida del usuario. Las impresiones deben ser manejadas únicamente por esta clase.
Debe existir un menú en la clase principal que le pregunte al usuario qué operación desea hacer. */
package POO.aritmetica;

import java.util.Scanner;

public class Operar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mensajeria mr = new Mensajeria();
        Aritmetica ar = new Aritmetica();

        mr.Bienvenida();

        int opcion = 0;

        while (opcion != 5) {
            
            mr.mostrarMenu();
            opcion = sc.nextInt();

            if (opcion > 0 && opcion <= 4) {

                double a = mr.pedirNumeros("ingrese el primer numero");
                double b = mr.pedirNumeros("ingrese el segundo numero");
                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = ar.suma(a, b);
                        break;
                    case 2:
                        resultado = ar.resta(a, b);
                        break;
                    case 3:
                        resultado = ar.multiplicacion(a, b);
                        break;
                    case 4:
                        resultado = ar.division(a, b);
                        break;
                    case 5:
                        mr.mensajeSalir();
                        break;
                    default:
                        mr.opcionIncorrecta();
                        break;
                }
                mr.MostrarResultado(resultado);
            }
        }
        mr.Despedida();
        sc.close();
    }
}

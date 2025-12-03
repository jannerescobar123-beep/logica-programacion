package POO.biblioteca;

import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = sc.nextLine();

        Miembro miembro = new Miembro(nombre);

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel");
        Libro libro2 = new Libro("Don quijote de la mancha", "Miguel");
        Libro libro3 = new Libro("El gordo y sus aventuras", "Eliana");

        miembro.prestarLibro(libro1);
        miembro.prestarLibro(libro2);
        miembro.prestarLibro(libro3);
        miembro.mostrarLibros();
        sc.close();
    }
}

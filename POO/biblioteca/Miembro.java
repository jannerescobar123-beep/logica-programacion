package POO.biblioteca;

import java.util.ArrayList;

public class Miembro {
    private String nombre;
    ArrayList<Libro>librosPrestados;

    public Miembro (String nombre){
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }
    public void prestarLibro(Libro libro){
        librosPrestados.add(libro);
    }
    public void devolverLibro (Libro libro){
        librosPrestados.remove(libro);
    }
    public void mostrarLibros (){
        System.out.println(" SUS LIBROS PRESTADOS " + nombre + ":");
        for (Libro libro : librosPrestados){
            System.out.println(" - " + libro);
        }
    }
}

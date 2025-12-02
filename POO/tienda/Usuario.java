package POO.tienda;

import java.util.ArrayList;

public class Usuario { // <--- CLASE
    // ATRIBUTOS
    String nombre;
    ArrayList<Producto> carrito; // Un atributo complejo (unalista)
    // CONSTRUCTOR

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.carrito = new ArrayList<Producto>(); //// Inicializa la lista vacía
    }

    // MÉTODO 1: Acción de comprar
    public void agregarProductoAlCarrito(Producto producto) {
        this.carrito.add(producto);
        System.out.println(producto.nombre + " ha sido agregado al carrito de " + this.nombre);
    }



    public double calcularTotal() {
        double total = 0.0;
        // Ciclo for-each para recorrer el atributo 'carrito'
        for (Producto producto : this.carrito) {
            total = total + producto.precio;
        }
        return total; // Devuelve un valor
    }
}

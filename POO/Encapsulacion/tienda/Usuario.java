package POO.Encapsulacion.tienda;
import java.util.ArrayList;


public class Usuario {
    private ArrayList<Producto> carritoList;

    public Usuario (){
        carritoList = new ArrayList<>();
    }
    public void  agregarAlCarrito(Producto producto){
        carritoList.add(producto);
    }
        public ArrayList<Producto> getCarrito(){
        return carritoList;
    }
}

package POO.Encapsulacion.tienda;


    public class Producto  {
    private String nombre;
    private double precios;

    public Producto(String nombre, double precios) {
        this.nombre = nombre;
        setPrecio(precios);

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precios;
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precios = nuevoPrecio;
        }else{
            System.out.println("el precio debe ser mayor a cero");
        }
    }
}


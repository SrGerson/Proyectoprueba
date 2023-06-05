package CodeGer.practias;

public class Producto {
    private  String nombre;
    private double precio;
    private int cantidadDisponible;


    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularTotal(int cantidad)
    {
          return precio*cantidad;
    }


}

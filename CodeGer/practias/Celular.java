package CodeGer.practias;

public class Celular extends Producto {

    private String marca;
    private  String modelo;

    public Celular(String nombre, double precio, int cantidadDisponible, String marca, String modelo) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

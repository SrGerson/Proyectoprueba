package ATS.Autos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private  float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrardatos(){

        return "\nMarca: " + marca +"\nModelo: " +  modelo + "\nPrecio: " + precio + "\n";
    }
}

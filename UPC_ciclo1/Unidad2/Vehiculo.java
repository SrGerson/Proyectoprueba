package UPC_ciclo1.Unidad2;

public class Vehiculo {
    private String color;
    private String propietario;
    private String marca;
    private String modelo;
    private int fecha_fabricacion;


    public Vehiculo(String color, String propietario, String marca, String modelo, int fecha_fabricacion) {
        this.color = color;
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha_fabricacion = fecha_fabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", propietario='" + propietario + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha_fabricacion=" + fecha_fabricacion +
                '}';
    }
}

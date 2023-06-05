package UPC_ciclo1.Unidad2;

public class Scooter extends Vehiculo{
    private double duracionBateria;

    public Scooter(String color, String propietario, String marca, String modelo, int fecha_fabricacion, double duracionBateria) {
        super(color, propietario, marca, modelo, fecha_fabricacion);
        this.duracionBateria = duracionBateria;
    }
}

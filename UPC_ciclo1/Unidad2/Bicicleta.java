package UPC_ciclo1.Unidad2;

public class Bicicleta extends Vehiculo {
    private int num_cambios;

    public Bicicleta(String color, String propietario, String marca, String modelo, int fecha_fabricacion, int num_cambios) {
        super(color, propietario, marca, modelo, fecha_fabricacion);
        this.num_cambios = num_cambios;
    }
}

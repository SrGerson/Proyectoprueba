package UPC_ciclo1.Unidad2;

public class Scooter extends Vehiculo{
    private final double duracionBateria;

    public Scooter(String color, String propietario, String marca, String modelo, int fecha_fabricacion, double duracionBateria) {
        super(color, propietario, marca, modelo, fecha_fabricacion);
        this.duracionBateria = duracionBateria;

    }

    @Override
    public String toString() {
        return "Scooter{" + toStringAtributosVehiculos()+
                "duracionBateria= " + duracionBateria +
                '}';
    }

    @Override
    public void avanzar() {
        System.out.println("El scooter " + mensajeAvanzar());
    }

    @Override
    public double getPrecioventa() {
        return 220;
    }
}

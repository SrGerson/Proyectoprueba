package UPC_ciclo1.Unidad2;

public class Bicicleta extends Vehiculo {
    private int num_cambios;

    public Bicicleta(String color, String propietario, String marca, String modelo, int fecha_fabricacion, int num_cambios) {
        super(color, propietario, marca, modelo, fecha_fabricacion);
        this.num_cambios = num_cambios;

    }

    @Override
    public String toString() {
        return "Bicicleta{" + toStringAtributosVehiculos()+
                ", num_cambios= " + num_cambios +
                '}';
    }

    @Override
    public void avanzar() {

      //  super.avanzar(); este super me manda al contenido del metodo del padre que en este caso es vehiculo
        System.out.println("La bicicleta " + mensajeAvanzar());
    }

    @Override
    public double getPrecioventa() {
        return 3000;
    }
}

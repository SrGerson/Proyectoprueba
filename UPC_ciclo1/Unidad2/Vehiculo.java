package UPC_ciclo1.Unidad2;
//el abstrac tenemos que tener un metodo abastracto si o si
public abstract class Vehiculo {
    private final String color;
    private final String propietario;
    private final String marca;
    private final String modelo;
    private final int fecha_fabricacion;


    public Vehiculo(String color, String propietario, String marca, String modelo, int fecha_fabricacion) {
        this.color = color;
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha_fabricacion = fecha_fabricacion;

    }

    @Override
    public String toString() {
        return "Vehiculo{" +toStringAtributosVehiculos()+ '}';


    }

    public String toStringAtributosVehiculos()
    {
        return   "color='" + color + '\'' +
                ", propietario='" + propietario + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha_fabricacion= " + fecha_fabricacion ;
    }
    public String mensajeAvanzar(){
        return " de marca " + marca +"  y modelo "+ modelo+" esta avanzando ";
    }

    public void avanzar() {
        System.out.println("El vehículo " + mensajeAvanzar());
    }
    public  abstract double  getPrecioventa();
}

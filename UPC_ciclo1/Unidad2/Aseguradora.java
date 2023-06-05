package UPC_ciclo1.Unidad2;

public class Aseguradora extends Suv{
    private  String nombre;
    private int fecha_fund;

    public Aseguradora(String color, String propietario, String marca, String modelo, int fecha_fabricacion, String placa, int numero_puertas, boolean GPS, boolean llanta_trasera, String nombre, int fecha_fund) {
        super(color, propietario, marca, modelo, fecha_fabricacion, placa, numero_puertas, GPS, llanta_trasera);
        this.nombre = nombre;
        this.fecha_fund = fecha_fund;
    }
}

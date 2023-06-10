package UPC_ciclo1.Unidad2;

public class Suv extends Automovil{
    private boolean GPS;
    private boolean llanta_trasera;

    public Suv(String color, String propietario, String marca, String modelo, int fecha_fabricacion, String placa, int numero_puertas, boolean GPS, boolean llanta_trasera) {
        super(color, propietario, marca, modelo, fecha_fabricacion, placa, numero_puertas);
        this.GPS = GPS;
        this.llanta_trasera = llanta_trasera;
    }



    @Override
    public String toString() {
        return "Suv{" + toStringAtributosAutomovil()+
                " ,GPS= " + GPS +
                ", llanta_trasera=" + llanta_trasera +
                '}';
    }


}

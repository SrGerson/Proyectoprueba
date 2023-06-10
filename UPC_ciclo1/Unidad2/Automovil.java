package UPC_ciclo1.Unidad2;

public  class  Automovil extends Vehiculo {

    private String placa;
    private int numero_puertas;

    public Automovil(String color, String propietario, String marca, String modelo, int fecha_fabricacion, String placa, int numero_puertas) {
        super(color, propietario, marca, modelo, fecha_fabricacion);
        this.placa = placa;
        this.numero_puertas = numero_puertas;
    }


    @Override
    public String toString() {
        return "Automovil{" +
                toStringAtributosAutomovil()+
                '}';
    }

    public String toStringAtributosAutomovil()
    {
        return toStringAtributosVehiculos() +
                "placa= '" + placa + '\'' +
                ", numero_puertas= " + numero_puertas ;

    }
    @Override
    public void  avanzar(){
        System.out.println("El automovil " +  mensajeAvanzar());

    }

    @Override
    public double getPrecioventa() {
        return 1200;
    }
}

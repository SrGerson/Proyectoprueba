package UPC_ciclo1.Unidad2.PC1;

public class Hatchback extends Autos {
    private final  int tiempos;
    private double preciobase;


    public Hatchback(String marca, String material, String transmision, double cilindrada, String tipo, int tiempos,double preciobase) {
        super(marca, material, transmision, cilindrada, tipo);
        this.tiempos = tiempos;
        this.preciobase =preciobase;
    }

    @Override
    public String toString() {
        return imprimirmensaje()+
                "tiempos=" + tiempos +
                '}';
    }

    @Override
    public double obtenerPreciofinal() {
        preciobase =getPreciobase();

        if(tiempos==2){
            preciobase += (preciobase*0.20);
        }else
            preciobase += (preciobase*0.10);

        return preciobase;
    }

    public double getPreciobase() {
        return preciobase;
    }






}

package UPC_ciclo1.Unidad2.PC1;

public class Convertible extends Autos {
    private final boolean maletera;

    public Convertible(String marca, String material, String transmision, double cilindrada, String tipo, boolean maletera , double precioBase) {
        super(marca, material, transmision, cilindrada, tipo);
        this.maletera = maletera;
    }

    public double getPrecioBase() {
        return 32000;
    }

    @Override
    public String toString() {
        return imprimirmensaje()+
                "maletera=" + maletera +
                '}';
    }

    @Override
    public double obtenerPreciofinal() {
        double  preciobase =getPrecioBase();


        if (maletera) {
            preciobase += 5000;


        }else
            preciobase =32000;

        return preciobase;


    }

}




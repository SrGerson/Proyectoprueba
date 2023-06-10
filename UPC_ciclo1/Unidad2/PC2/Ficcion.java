package UPC_ciclo1.Unidad2.PC2;

public class Ficcion extends Libros{


    private int numCapitulos;

    public Ficcion(String nombre, String titulo, String autor, String genero, int numPaginas, int numCapitulos) {
        super(nombre, titulo, autor, genero, numPaginas);
        this.numCapitulos = numCapitulos;
    }

    public int getNumCapitulos() {
        return numCapitulos;
    }

    @Override
    public String toString() {
        return  mensajelibro()+"Ficcion " +
                "numCapitulos=" + numCapitulos +
                '}';
    }

    @Override
    public double precioBase() {
        return 30;
    }

    public double  descuentoFiccion(){
        double descuento =0;
        int numeroCapitulos =getNumCapitulos();
        if (numeroCapitulos>10 )
           descuento = precioBase() +(precioBase() * 0.10);
        else
            descuento =precioBase();
        return descuento;

    }

    @Override
    public double precioFinal() {
        return descuentoFiccion();
    }
}

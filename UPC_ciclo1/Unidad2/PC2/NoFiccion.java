package UPC_ciclo1.Unidad2.PC2;

public class NoFiccion extends Libros {
private String temaPrincipal;

    public NoFiccion(String nombre, String titulo, String autor, String genero, int numPaginas, String temaPrincipal) {
        super(nombre, titulo, autor, genero, numPaginas);
        this.temaPrincipal = temaPrincipal;
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    @Override
    public String toString() {
        return  mensajelibro()+"NoFiccion " +
                "temaPrincipal='" + temaPrincipal + '\'' +
                '}';
    }

    @Override
    public double precioBase() {
        return 25;
    }
    public double descuentoNoficcion(){
        double descuento=0;

        if (getTemaPrincipal().equals("ciencia"))
            descuento =precioBase()+(precioBase()*0.15);
        else
            descuento =precioBase();
        return  descuento;
    }

    @Override
    public double precioFinal() {
        return  descuentoNoficcion();
    }
}

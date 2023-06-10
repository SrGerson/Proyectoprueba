package UPC_ciclo1.Unidad2.PC2;

public class Romance extends Libros {
    private String nombrePersonajePrinc;

    public Romance(String nombre, String titulo, String autor, String genero, int numPaginas, String nombrePersonajePrinc) {
        super(nombre, titulo, autor, genero, numPaginas);
        this.nombrePersonajePrinc = nombrePersonajePrinc;
    }

    @Override
    public String toString() {
        return mensajelibro()+" Romance " +
                "nombrePersonajePrinc='" + nombrePersonajePrinc + '\'' +
                '}';
    }

    public String getNombrePersonajePrinc() {
        return nombrePersonajePrinc;
    }

    @Override
    public double precioBase() {
        return 28;
    }

    public double descuentoRomance(){
        double descuento = 0;
        if (getNombrePersonajePrinc().startsWith("R")){
            descuento = precioBase()+(precioBase()*0.12);
        }else
            descuento =precioBase();

        return descuento;
    }

    @Override
    public double precioFinal() {
        return descuentoRomance();
    }
}


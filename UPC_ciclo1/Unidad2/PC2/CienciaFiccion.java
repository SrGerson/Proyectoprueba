package UPC_ciclo1.Unidad2.PC2;

public class CienciaFiccion extends Libros{
    private String fechaPublicacion;
    private String obra;


    public CienciaFiccion(String nombre, String titulo, String autor, String genero, int numPaginas, String fechaPublicacion, String obra) {
        super(nombre, titulo, autor, genero, numPaginas);
        this.fechaPublicacion = fechaPublicacion;
        this.obra = obra;

    }

    @Override
    public String toString() {
        return mensajelibro()+ "CienciaFiccion " +
                " fechaPublicacion='" + fechaPublicacion + '\'' +
                ", obraClasica='" + obra + '\'' +
                '}';
    }

    public String getObra() {
        return obra;
    }

    @Override
    public double precioBase() {
     return 35;
    }
    public double descuentoCienciaficcion(){
        double descuentoclas=0;
        if (getObra().equals("clasica"))
            descuentoclas = precioBase()+(precioBase()*0.5);
        else
            descuentoclas =precioBase();
        return  descuentoclas;

    }

    @Override
    public double precioFinal() {
        return descuentoCienciaficcion();
    }
}

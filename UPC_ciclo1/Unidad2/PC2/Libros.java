package UPC_ciclo1.Unidad2.PC2;

public abstract class  Libros {
    protected String nombre;
    protected String titulo;
    protected String autor;
    protected String genero;
    protected  int numPaginas;

    public Libros(String nombre, String titulo, String autor, String genero, int numPaginas) {
       this.nombre=nombre;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Libros{" + mensajelibro() + '}';


    }
    public  String mensajelibro(){
        return "nombre= " + nombre +" titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", numPaginas=" + numPaginas ;

    }

    public  double precioBase(){
        return 0;
    }
    public double precioFinal(){
        return 0;
    }
}

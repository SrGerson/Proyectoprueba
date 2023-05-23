package CodeGer;

public class Tablero {

    private int columnas;
    private int filas;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }
    public boolean(int x,int y){
        return x>=0 && x<columnas && y>=0 && y<filas;
    }
}

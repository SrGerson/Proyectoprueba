package paquete1.Pruebas;

public class Tablero {
    private int filas;
    private int columnas;

    public Tablero(int filas, int columnas) {
        this.filas=filas;
        this.columnas=columnas;
    }

    public boolean estaDentro(int x, int y) {

            return x >= 0 && x < columnas && y >= 0 && y < filas;
        }
    }




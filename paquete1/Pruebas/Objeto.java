package paquete1.Pruebas;

public class Objeto {
    private int x;
    private int y;

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moverArriba() {
        y++;
    }

    public void moverDerecha() {
        x++;
    }

    public void moverAbajo() {
        y--;
    }

    public void moverIzquierda() {
        x--;
    }
}

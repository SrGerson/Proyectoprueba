package CodeGer.practias.practias2;

public class Soldado extends Unidad{
    private int rangoDeAtaque;

    public Soldado(String nombre, int puntosVida, double velocidad, int rangoDeAtaque) {
        super(nombre, puntosVida, velocidad);
        this.rangoDeAtaque = rangoDeAtaque;
    }

    public void setRangoDeAtaque(int rangoDeAtaque) {
        this.rangoDeAtaque = rangoDeAtaque;
    }

    public int getRangoDeAtaque() {
        return rangoDeAtaque;
    }
}

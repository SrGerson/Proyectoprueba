package CodeGer.practias.practias2;

public class Caballeria extends Soldado {
    private int velocidadCarga;

    public Caballeria(String nombre, int puntosVida, double velocidad, int rangoDeAtaque, int velocidadCarga) {
        super(nombre, puntosVida, velocidad, rangoDeAtaque);
        this.velocidadCarga = velocidadCarga;
    }

    public int getVelocidadCarga() {
        return velocidadCarga;
    }

    public void setVelocidadCarga(int velocidadCarga) {
        this.velocidadCarga = velocidadCarga;
    }
}

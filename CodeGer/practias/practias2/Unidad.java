package CodeGer.practias.practias2;

public class Unidad {
    private  String nombre;
    private int puntosVida;
    private double velocidad;

    public Unidad(String nombre, int puntosVida, double velocidad) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void atacar(String nombre)
    {
        System.out.println("la unidad "+nombre+" esta atacando");
    }
}

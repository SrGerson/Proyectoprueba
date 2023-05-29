package UPC_ciclo1.Ejercicio2;

import java.util.Random;

public class PerrosCorredores {
    private String nombre;
    private  int num_pista;
    private int velocidad;
    private Random random;

    public PerrosCorredores(String nombre, int num_pista, int velocidad) {
        this.nombre = nombre;
        this.num_pista = num_pista;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_pista() {
        return num_pista;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double generadorAleatorio(){
   Random random = new Random();
   int numero_Aletorio = random.nextInt(10)+1;
        return velocidad+numero_Aletorio;

    }

            

    
}


package CodeGer.practias.practias2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Caballeria> listcaballeria = new ArrayList<>();
        Caballeria soldado = new Caballeria("Julio",12,122,80,23);
        listcaballeria.add(soldado);


         System.out.println("nombre: " + soldado.getNombre());
        System.out.println("puntos de vida: " + soldado.getPuntosVida());
        System.out.println("Velocidad: " + soldado.getVelocidad());
        System.out.println("Ramgo de ataque" + soldado.getRangoDeAtaque());
        System.out.println("velocidad de carga" + soldado.getVelocidadCarga());


    }
}

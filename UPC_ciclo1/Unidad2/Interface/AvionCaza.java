package UPC_ciclo1.Unidad2.Interface;

public class AvionCaza implements Volador {
    @Override
    public void despegar() {
        System.out.println("El avión caza despega a gran velocidad.");
    }

    @Override
    public void volar() {
        System.out.println("El avión caza está realizando maniobras en el aire.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión caza aterriza con precisión.");
    }
}

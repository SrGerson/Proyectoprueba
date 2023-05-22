package ATS;
/*
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posición
dentro del mismo.Los movimientos posibles son ARRIBA, DERECHA,ABAJO,IZQUIERDA,tras cada movimiento el programa
mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero
 */
public class Tablero {
    // atributos
     private int x;
     private int y ;

     // metodos constructor


    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void obtenerResultados(){

    }
}

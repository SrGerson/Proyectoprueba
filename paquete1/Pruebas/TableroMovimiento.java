package paquete1.Pruebas;

import java.util.Scanner;

public class TableroMovimiento {
    public static void main(String[] args) {
        int filas = 5; // Número de filas del tablero
        int columnas = 5; // Número de columnas del tablero

        Tablero tablero = new Tablero(filas, columnas);
        Objeto objeto = new Objeto(0, 0);

       Scanner input = new Scanner(System.in);

        // Bucle principal del programa
        while (true) {
            // Mostrar la dirección y las coordenadas actuales
            System.out.println("Dirección actual: (" + objeto.getX() + ", " + objeto.getY() + ")");
            System.out.print("Ingrese el movimiento (ARRIBA, DERECHA, ABAJO, IZQUIERDA): ");
            String movimiento = input.nextLine();

            // Actualizar la posición según el movimiento ingresado
            if (movimiento.equals("ARRIBA")) {
                objeto.moverArriba();
            } else if (movimiento.equals("DERECHA")) {
                objeto.moverDerecha();
            } else if (movimiento.equals("ABAJO")) {
                objeto.moverAbajo();
            } else if (movimiento.equals("IZQUIERDA")) {
                objeto.moverIzquierda();
            } else {
                System.out.println("Movimiento inválido. Por favor, ingrese un movimiento válido.");
                continue;
            }
            

            // Verificar si el objeto está dentro del tablero
            if (tablero.estaDentro(objeto.getX(), objeto.getY())) {
                System.out.println("El objeto se ha movido a la posición: (" + objeto.getX() + ", " + objeto.getY() + ")");
            } else {
                System.out.println("¡El objeto se ha salido del tablero!");
                break;
            }
        }
    }
}

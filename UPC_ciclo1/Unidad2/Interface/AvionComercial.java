package UPC_ciclo1.Unidad2.Interface;

public class AvionComercial implements Volador {
    // Creamos una clase de avión comercial que implementa la interfaz Volador

        @Override
        public void despegar() {
            System.out.println("El avión comercial despega.");
        }

        @Override
        public void volar() {
            System.out.println("El avión comercial está volando.");
        }

        @Override
        public void aterrizar() {
            System.out.println("El avión comercial aterriza.");
        }


    }


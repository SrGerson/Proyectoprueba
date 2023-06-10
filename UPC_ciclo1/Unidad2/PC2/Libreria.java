package UPC_ciclo1.Unidad2.PC2;

import java.util.ArrayList;

public class Libreria {
    private String nombre;

    ArrayList<Libros> listLibros = new ArrayList<>();


    public void agregarLibros(Libros libro){
        listLibros.add(libro);
    }
    public Libreria(String nombre) {
        this.nombre = nombre;
    }
    public void imprimirlibros(){
        for (Libros li:listLibros
             ) {
            System.out.println(li);
        }
    }
    public void preciofinal (){
        for (Libros li:listLibros
             ) {
            System.out.println("precio final incluyendo descuento " + li.getNombre() +" es " +  li.precioFinal());
        }
    }

        public void cantLibroFiccion() {
            int contador = 0;
            for (Libros libro : listLibros) {

                if (libro instanceof CienciaFiccion) { // Verifica si el libro es de la clase CienciaFiccion
                    CienciaFiccion cienciaFiccion = (CienciaFiccion) libro; // Realiza un casting a CienciaFiccion
                    if (cienciaFiccion.getObra().equals("clasica")) {
                        contador++;
                    }
                }
            }

            System.out.println("La cantidad de libros de ciencia ficción y obra clásica es: " + contador);
        }

    public void libroMasCaro() {
        Libros libroMasCaro = null; // Variable para almacenar el libro más caro encontrado
        double precioMaximo = 0; // Variable para almacenar el precio máximo encontrado

        for (Libros libro : listLibros) {
            double precioFinal = libro.precioFinal(); // Obtenemos el precio final del libro

            if (precioFinal > precioMaximo) { // Si encontramos un precio más alto
                precioMaximo = precioFinal; // Actualizamos el precio máximo
                libroMasCaro = libro; // Actualizamos el libro más caro
            }
        }

        if (libroMasCaro != null) {
            System.out.println("El libro más caro es: " + libroMasCaro.getNombre() + " con un precio de: " + precioMaximo);
        } else {
            System.out.println("No se encontraron libros");
        }

    }
    }

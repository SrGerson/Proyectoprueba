package UPC_ciclo1.Unidad2.PC1;

/*
Aplicando herencia, desarrolla un programa que permita realizar lo siguiente:

a)	Desarrollar el diagrama de clases usando UML. Adjunte la imagen del diagrama o péguela en un archivo, que deberá incluir como parte de la respuesta al presente caso. (2 puntos)
b)	Registrar al menos 6 autos, 2 de cada tipo. (2 puntos)
c)	Listar todos los autos registrados y mostrar en pantalla todas sus características y el precio final. (2 puntos)
d)	Elaborar un método que retorne la cantidad de autos de tipo hatchback que existen registradas en la tienda (2 puntos)
e)	Mostrar en pantalla todas las características del auto con el menor precio final (2 puntos)

 */

import java.util.ArrayList;

    public class Consecionaria {
        public Consecionaria() {
        }

        ArrayList<Autos> listautos =new ArrayList<>();

        public void agregarAutos(Autos autos){
           listautos.add(autos);
        }

        public void imprimirAutos(){
            for (Autos auto:listautos
                 ) {
                System.out.println(auto);
            }
        }

        public void precioFinalAutos() {
            for (Autos auto : listautos) {
                System.out.println("el precio final de la marca: "+ auto.getMarca() + " es: " +auto.obtenerPreciofinal());
            }
        }
        /*
        public void preciFinall() {
            for (Autos auto : listautos) { // Recorremos la lista de autos
                if (auto instanceof Sedan sedan) { // Verificamos si el auto es de tipo Sedan
                 // auto es el objeto Sedan es la clase que queremos verificar, instanceof significa comprobación de tipo
                    sedan.precioFinal();  // Llamamos al método precioFinal específico de la clase Sedan
                }

            }
            for (Autos auto:listautos
            ) {
                if (auto instanceof Convertible convertible) {
                    convertible.precioFinal();

                }
            }
            /*
            for (Autos auto :listautos
            ) {
                if (auto instanceof Hatchback hatchbacks ){
                    hatchbacks.precioFinal();
                }

            }
        }

             */


        //Elaborar un método que retorne la cantidad de autos de tipo hatchback que existen registradas en la tienda (2 puntos)
        public void cant_AutoHatchback(){
            int contador=0;
            for (Autos autoH:listautos
                 ) {
                if (autoH instanceof Hatchback ){
                contador++;

                }
            }
            System.out.println("cantidad de autos Hatchback  '" + contador + "'");
        }
     //   e)	Mostrar en pantalla todas las características del auto con el menor precio final (2 puntos)
     public void mostrarCaracteristicasAutoMenorPrecio() {
         // Creamos variables para guardar el precio más bajo y el auto con el precio más bajo
         double menorPrecioFinal = Double.MAX_VALUE; // Guarda el valor más grande posible inicialmente
         Autos autoMenorPrecio = null; // No hay ningún auto inicialmente

         for (Autos auto : listautos) {
             double precioFinal = auto.obtenerPreciofinal();  // Obtenemos el precio final del auto
             if (precioFinal < menorPrecioFinal) {  // Comparamos el precio final con el precio más bajo guardado hasta ahora
                 // Si encontramos un precio más bajo, actualizamos las variables
                 menorPrecioFinal = precioFinal; // Guardamos el nuevo precio más bajo
                 autoMenorPrecio = auto;  // Guardamos el auto con el precio más bajo
             }
         }

         if (autoMenorPrecio != null) {  // Verificamos si encontramos un auto con precio más bajo
             // Si encontramos un auto con precio más bajo, mostramos sus características
             System.out.println("Características del auto con el menor precio final:");
             System.out.println(autoMenorPrecio);
         }
     }

        }









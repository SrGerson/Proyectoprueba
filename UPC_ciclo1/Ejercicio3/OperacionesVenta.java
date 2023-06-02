package UPC_ciclo1.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesVenta {
    ArrayList<Vendedores> listaVendedores = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    double venta1, venta2, venta3;

    String vendedorPremium;
    String codigo;
    Vendedores agregarVendedores = new Vendedores();


    public OperacionesVenta() {
    }


    public void agregarvendedor() {
        boolean codigoRepetido;
        System.out.println("\nIngrese la cantidad de vendedores ");
        int can_vendedores = input.nextInt();
        for (int i = 0; i < can_vendedores; i++) {

            input.nextLine(); // Limpiar el buffer del scanner
            codigoRepetido = false; // Reiniciar la variable en cada iteración
            System.out.print("Ingrese el codigo del vendedor: " + (i + 1) + ": ");
            codigo = input.nextLine(); //"Espera a que el usuario termine de escribir y presione Enter para eso funciona

            // Verificar si el código ya existe en algún vendedor de la lista
            //  Recorremos la lista de vendedores uno por uno, como si estuviéramos revisando cada uno de ellos.
            for (Vendedores vendedor : listaVendedores) {
                //  Vendedores Indica que estamos recorriendo una lista de objetos de la clase "Vendedores".
                //Vendedores seria el tipo de juguete , vendedor seria el juguete y listavendedores seria la caja llena de juguetes:
                // Comprobamos si el código del vendedor es igual al código que queremos ingresar
                if (vendedor.getCodigo().equals(codigo)) {
                    // Si encontramos un vendedor con el mismo código, es como si encontramos a un amigo
                    // que ya está en la lista de invitados de una fiesta.
                    // Entonces, mostramos un mensaje diciendo que el código ya ha sido ingresado.
                    System.out.println("El código del vendedor " + codigo + " ya ha sido ingresado. Por favor, ingrese un código válido.");
                    // Marcamos la bandera como verdadera para indicar que encontramos un vendedor repetido.
                    codigoRepetido = true;
                    // Salimos del bucle, ya que no necesitamos seguir buscando en la lista.
                    break;

                }
            }

            if (!codigoRepetido) {
                // Crear una nueva instancia de Vendedores
                System.out.print("Digite la venta semana 1: ");
                venta1 = input.nextDouble();
                System.out.print("Digite la venta semana 2: ");
                venta2 = input.nextDouble();
                System.out.print("Digite la venta de semana 3: ");
                venta3 = input.nextDouble();
                agregarVendedores.setCodigo(codigo);
                agregarVendedores.setVenta1(venta1);
                agregarVendedores.setVenta2(venta2);
                agregarVendedores.setVenta3(venta3);
                Vendedores nuevoVendedor = new Vendedores(codigo, venta1, venta2, venta3);

                listaVendedores.add(nuevoVendedor);
            }

        }
    }


    public void totalVentas() {

        double sumaventas;
        for (Vendedores vendedor : listaVendedores
        ) {
            sumaventas = vendedor.getVenta1() + vendedor.getVenta2() + vendedor.getVenta3();
            vendedor.setTotalVentas(sumaventas);
        }
    }

    public void calcularPromedioVentas() {
        for (Vendedores a : listaVendedores) {
            double sumaVentas = a.getVenta1() + a.getVenta2() + a.getVenta3();
            double promedioVentas = sumaVentas / 3;
            double promedioventasredondeado = Math.round(promedioVentas * 100) / 100.0;

            a.setPromedioventas(promedioventasredondeado);

        }
    }


    public void calcularBonoTradicional() {
        for (Vendedores vendedor : listaVendedores) {
            double bonoTrad = vendedor.getPromedioventas();
            int bono = 0; // Esta variable representará el bono del vendedor.
            if (bonoTrad <= 1000) {
                bono = 3;// Si el promedio de ventas es menor o igual a 1000, asignamos el valor 3 a la variable bono.
                // Esto significa que el bono del vendedor será del 3%.
            } else if (bonoTrad >= 1000 && bonoTrad < 2000) {
                bono = 5;
            } else if (bonoTrad >= 2000) {
                bono = 10;
            }
            vendedor.setBono(bono); //Esto actualiza el bono del vendedor con el valor correspondiente.

        }
    }


    public void bonoPremium() {
        double maxVenta = -1; // Variable para almacenar al vendedor con el promedio de ventas más alto
        vendedorPremium = null;   //  Inicializamos la variable del vendedor premium como nula

        for (Vendedores vendedor : listaVendedores) {  //Recorremos la lista de vendedores uno por uno,
            //   Comparamos el promedio de ventas del vendedor actual con el valor máximo registrado hasta el momento

            if (vendedor.getPromedioventas() > maxVenta) {    // Si el promedio de ventas del vendedor actual es mayor al valor máximo registrado,
                maxVenta = vendedor.getPromedioventas();   // Actualizamos el máximo con el nuevo promedio de ventas
                vendedorPremium = vendedor.getCodigo();// Guardamos el código del vendedor con el mejor promedio en la variable vendedorPremium

            }

        }


    }


    public void imprimirResultados() {
        for (Vendedores vendedor : listaVendedores) {
            System.out.println("Vendedor " + vendedor.getCodigo());
            System.out.println("venta1 " + vendedor.getVenta1());
            System.out.println("venta2 " + vendedor.getVenta2());
            System.out.println("venta3 " + vendedor.getVenta3());
            System.out.println("Total de ventas: " + vendedor.getTotalVentas());
            System.out.println("Promedio de ventas:  " + vendedor.getPromedioventas());
            System.out.println("Bono del vendedor: " + vendedor.getBono() + "%");
            System.out.println("---------------------------");

        }
        if (vendedorPremium != null) {   // Verifica si el código del vendedor premium no es nulo
            for (Vendedores vendedor : listaVendedores) {  // Recorre la lista de vendedores
                if (vendedor.getCodigo().equals(vendedorPremium)) {  // Compara el código del vendedor con el código del vendedor premium
                    System.out.println("Vendedor con mayor promedio de ventas es: " + vendedor.getCodigo()); // Imprime el nombre del vendedor con el mayor promedio de ventas
                    break; // Sale del bucle ya que se encontró el vendedor con el mayor promedio
                }
            }
        }
/*

Primero, revisamos si tenemos un "vendedorPremium". Esto es como tener una etiqueta especial para el vendedor que tiene el mejor promedio de ventas.
Si tenemos un "vendedorPremium" (es decir, si la etiqueta no está vacía), entonces hacemos lo siguiente:

Empezamos a revisar cada uno de los vendedores en la lista, uno por uno.
Para cada vendedor, comparamos su código con el código del "vendedorPremium". El código es como un número que los identifica.
Si encontramos un vendedor que tiene el mismo código que el "vendedorPremium", entonces hemos encontrado al vendedor con el mejor promedio de ventas.
En ese caso, imprimimos en la pantalla el nombre de ese vendedor. El nombre es como su identificación personal.
Después de imprimir el nombre, salimos del ciclo. Esto significa que no seguimos revisando más vendedores porque ya encontramos al mejor.
Si no encontramos un "vendedorPremium", significa que no hay ningún vendedor con el mejor promedio de ventas. En ese caso, no imprimimos nada.

Es importante recordar llamar primero al método "bonoPremium()" antes de llamar al método "imprimirResultados()", para asegurarnos de que la etiqueta "vendedorPremium" se haya actualizado correctamente.
 */

    }
}










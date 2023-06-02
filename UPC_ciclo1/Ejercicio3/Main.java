package UPC_ciclo1.Ejercicio3;

import java.util.Scanner;

/*

3)	Una Empresa desea determinar el bono tradicional a otorgar a un grupo de vendedores:
Si el monto de venta de cada vendedor es menor o igual a 1,000 soles el bono es del 3%, si es mayor que 1,000 pero menor o igual que 2000 soles, el bono es del 5%, y si es mayor a 2,000 soles 10%.
Adicionalmente se otorga un bono premium que es un almuerzo para dos en “Chillis” al vendedor que superó su venta al promedio de ventas de todos los vendedores.
Se pide:
a)	Dado un código de vendedor, obtener el bono tradicional que le corresponde.
b)	El promedio de bonos tradicionales que se les otorgará a todos los vendedores.
c)	La lista de vendedores que obtendrían el bono premium.



 */
public class Main {
    public static void main(String[] args) {
        String opcion ;

        Scanner input = new Scanner(System.in);
        OperacionesVenta operacionesVenta = new OperacionesVenta();

       System.out.print(" Bienvenido a la base de dados" );
        do {
            operacionesVenta.agregarvendedor();
            System.out.println("Desea seguir ingresando vendedores? \nSi/No");
            opcion = input.nextLine();
        }while (opcion.equals("SI"));

        operacionesVenta.totalVentas();
        operacionesVenta.calcularPromedioVentas();
        operacionesVenta.calcularBonoTradicional();
        operacionesVenta.bonoPremium();
        operacionesVenta.imprimirResultados();

    }

}

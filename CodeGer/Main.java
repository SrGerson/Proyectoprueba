package CodeGer;

import java.util.Scanner;


public class Main {


    public static int indicecocheMBarato(Vehiculo coches[]){
        float precio;
        int indice=0;
        precio =coches[0].getPrecio();
        for (int i =1;i<coches.length;i++){
            if (coches[i].getPrecio()<precio){
                precio =coches[i].getPrecio();
                indice =i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int num_vehiculos,indCoche_barato;

        System.out.print("Digite la cantidad de Vehiculos ");
        num_vehiculos=entrada.nextInt();
        //creamos los objetos para los coches
        Vehiculo coches []= new Vehiculo[num_vehiculos];
        for (int i=0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("\ndigite las caracteristicas del Coche" + (i+1) + ":");
            System.out.print("introduzca la Marca: ");
            marca = entrada.nextLine();
            System.out.print("introduzca el modelo del Coche: ");
            modelo=entrada.nextLine();
            System.out.print("introduzca el precio: ");
            precio = entrada.nextFloat();
            coches[i]= new Vehiculo(marca,modelo,precio);


        }
        indCoche_barato=indicecocheMBarato(coches);
        System.out.println("\nEl Coche mas barato es: ");
        System.out.println(coches[indCoche_barato].mostrarDatos());



    }
}

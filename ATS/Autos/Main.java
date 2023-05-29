package ATS.Autos;

import java.util.Scanner;

public class Main {
    public static int indicecocheMbarato(Vehiculo coches[]){
    float precio;
    int indice =0;
    precio = coches[0].getPrecio();
    for (int i =1;i<coches.length;i++){
        if (coches[i].getPrecio()<precio) {
            precio = coches[i].getPrecio();
            indice = i;
        }
    }

    return indice;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int num_vehiculos;
        int indicebarato;
        System.out.println("digite la cantidad de vehiculos: ");
        num_vehiculos = input.nextInt();

        Vehiculo coches [] = new Vehiculo[num_vehiculos];
        for ( int i=0; i<coches.length;i++){
            input.nextLine();
            System.out.println("\nDigite las caracteristicas del coche " + (i+1) + ":");
            System.out.print("Digite la marca: ");
            marca = input.nextLine();
            System.out.print("Digite el modelo: ");
            modelo = input.nextLine();
            System.out.print("Digite el precio: ");
            precio=input.nextFloat();
            coches[i] = new Vehiculo(marca,modelo,precio);

        }

        indicebarato=indicecocheMbarato(coches);
        System.out.println("\nEl coche mas barato es : ");
        System.out.println(coches[indicebarato].mostrardatos());

    }
}

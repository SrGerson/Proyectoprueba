package UPC_ciclo1.Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OperacionesPerros {
    ArrayList<PerrosCorredores> lisperros = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    PerrosCorredores agregarPerro = new PerrosCorredores();
    String nombre;

    public void perrosagregados() {
        boolean perroRepetido = false;
        int contador, velocidadBase , num_pista;

        System.out.print("ingrese la cantidad de perros al canódromo ");
        contador = input.nextInt();

        for (int i = 0; i < contador; i++) {
            input.nextLine();
            System.out.print("ingrese nombre del  perro: " + (i + 1)+ " : ");
            nombre = input.nextLine();
            for (PerrosCorredores id_perro : lisperros
            ) {
                if (id_perro.getNombre().equals(nombre)) {
                    System.out.println("El nombre del perro " + nombre + "ya ha sido ingresado. Por favor ingrese un nombre valido");
                    perroRepetido = true;
                }
                break;
            }
            if (!perroRepetido) {

                do {
                    System.out.print("Ingrese la velocidad base del perro en el rango de 1 y 10: ");
                    velocidadBase = input.nextInt();
                    if (velocidadBase > 10)
                        System.out.println("Ingrese un número correcto (entre 1 y 10)");


                }while (velocidadBase>10);
                    do {
                        System.out.print("Ingrese el numero de pista en el rango de 1 y 7: ");
                        num_pista = input.nextInt();
                        if (num_pista > 7)
                            System.out.println("Ingrese un número correcto entre ( 1 y 7): ");

                    }while (num_pista>7);
                agregarPerro.setNombre(nombre);
                agregarPerro.setVelocidadBase(velocidadBase);
                agregarPerro.setNum_pista(num_pista);
                PerrosCorredores newperro = new PerrosCorredores(nombre, velocidadBase, num_pista);
                lisperros.add(newperro);




            }

        }

    }


    public void generadorVelocidad() {
        int base ;
        int veFinal = 0;

        Random random = new Random();
        for (PerrosCorredores perro : lisperros
        ) {
            int numero_Aletorio = random.nextInt(10) + 1;
            base = perro.getVelocidadBase() + numero_Aletorio;

            veFinal = base * 40;
            perro.setVelocidadFinal(veFinal);

        }

    }


    public String velocidadFinal() {

        int velocidadMax = 0;
        String nombrePerro = null;

        for (PerrosCorredores perro : lisperros
        ) {

            if (perro.getVelocidadFinal() > velocidadMax) {
                velocidadMax = perro.getVelocidadFinal();
                nombrePerro = perro.getNombre();
            }


        }
        return nombrePerro;
    }




    public void imprimirResultados(){
        String perroMasrrapido =velocidadFinal();

        for (PerrosCorredores resultado:lisperros
             ) {

            System.out.println("Nombre del perro seleccionado: " +resultado.getNombre());
            System.out.println("Numero de pista seleccionada: " + resultado.getNum_pista());

        }
        input.nextLine();
        for (PerrosCorredores resultadoperro:lisperros
             ) {
            //consultar
            System.out.println("El perro: " + resultadoperro.getNombre()+" avanzo " + resultadoperro.getVelocidadFinal()+" metros");
        }

        if (perroMasrrapido != null) {
            System.out.println("El perro más rápido es: " + perroMasrrapido);
        } else {
            System.out.println("No se encontró ningún perro más rápido.");
        }



    }
}

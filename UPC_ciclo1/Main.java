package UPC_ciclo1;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arreglo[] = {17, 14, 18, 13};
        double suma = 0;
        double promedio;
        for (int i = 0; i < 4; i++) {
            suma = suma + arreglo[i];

        }
        promedio =  suma /4;

        System.out.println("el promedio es " + promedio);
    }
}

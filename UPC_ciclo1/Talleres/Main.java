package UPC_ciclo1.Talleres;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float lado1;
        float lado2;

        Cuadrilatelo c1;
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("ingrese digite el lado 1 "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese el lado 2"));
        if (lado1==lado2)
            c1 = new Cuadrilatelo(lado1);
        else {
            c1 =new Cuadrilatelo(lado1,lado2);
        }

        JOptionPane.showMessageDialog(null, " El perimetro es " + c1.obtenerPerimetro());
        JOptionPane.showMessageDialog(null, "El área es: " + c1.obtenerArea());
    }
}
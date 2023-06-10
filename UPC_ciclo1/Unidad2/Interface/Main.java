package UPC_ciclo1.Unidad2.Interface;

public class Main {
    // En el programa principal, podemos tratar los objetos de avión comercial y avión caza de la misma manera
    public static void main(String[] args) {
        Volador avionComercial = new AvionComercial();
        Volador avionCaza = new AvionCaza();

        avionComercial.despegar();
        avionComercial.volar();
        avionComercial.aterrizar();

        avionCaza.despegar();
        avionCaza.volar();
        avionCaza.aterrizar();
    }
}

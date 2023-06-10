package UPC_ciclo1.Unidad2.PC1;

public class Main {
    public static void main(String[] args) {
        Autos s1 =new Sedan("toyota","hierro","automatico",4,"sedan","posterior",25000);
        Autos s2 =new Sedan("kia","aluminio","mecanico",3,"sedan","delantera",25000);
        Autos h1 = new Hatchback("suzuki","hierro","automatico",2,"Hatchback",4,28000);
        Autos h2 = new Hatchback("kia","aluminio","mecanico",1,"Hatchback",2,28000);
        Autos c1 = new Convertible("chervolet","hierro","automatico",4,"Convertible",false,32000);
        Autos c2 = new Convertible("ford","aluminio","automatico",4,"Convertible",true,32000);
        Consecionaria consecionaria = new Consecionaria();
        consecionaria.agregarAutos(s1);
        consecionaria.agregarAutos(s2);
        consecionaria.agregarAutos(h1);
        consecionaria.agregarAutos(h2);
        consecionaria.agregarAutos(c1);
        consecionaria.agregarAutos(c2);
        consecionaria.imprimirAutos();
        System.out.println();
        consecionaria.precioFinalAutos();


        consecionaria.cant_AutoHatchback();
        consecionaria.mostrarCaracteristicasAutoMenorPrecio();






    }
}

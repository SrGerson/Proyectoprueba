package UPC_ciclo1.Unidad2;

public class EjecutadoraVeh {
    public static void main(String[] args) {
     //   Vehiculo v1 = new Vehiculo("negro", "ana", "Ford", "ecosport", 1983);
        Automovil a1 = new Automovil("rojo", "Carmen", "Kia", "sportage", 2019, "D36F", 4);
        Suv suv1 = new Suv("negro", "Gerson", "suv", "suvb", 2023, "D35F", 4, false, false);
        Bicicleta bic1 = new Bicicleta("negro", "gerson", "sad", "asdfas", 2022, 4);
        Scooter scooter1 =new Scooter("azul","SUSUKI","LOKS","0s5",1993,40);
        /*
        System.out.println(v1);
        System.out.println(a1);
        System.out.println(suv1);
        System.out.println(bic1);

         */

        Vehiculo a2 = new Automovil("amarillo", "Mark", "Mercedes Benz",
                "Modelo1", 2021, "AHK987", 4);
        Vehiculo b2 = new Bicicleta("roja", "Aurora", "Monark", "Modelo2",
                2019, 18);
        EmpresaVendedora empresa = new EmpresaVendedora("Maquinarias");
       // empresa.agregarVehiculo(v1);
        empresa.agregarVehiculo(a1);
        empresa.agregarVehiculo(suv1);
        empresa.agregarVehiculo(bic1);
        empresa.agregarVehiculo(a2);
        empresa.agregarVehiculo(b2);
        empresa.agregarVehiculo(scooter1);
        empresa.reporteVehiculos();
        System.out.println("----------------------------------");
        empresa.avanzarVehiculos();
        empresa.preciventa();



    }
}



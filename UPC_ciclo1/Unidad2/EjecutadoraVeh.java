package UPC_ciclo1.Unidad2;

public class EjecutadoraVeh {
    public static void main(String[] args) {
        Vehiculo v1 =new Vehiculo("negro","ana","Ford","ecosport",1983);
        Automovil a1 =new Automovil("rojo","Carmen","Kia","sportage",2019,"D36F",4);
        Suv suv1 =new Suv("negro","Gerson","suv","suvb",2023,"D35F",4,false,false);
        Bicicleta bic1=new Bicicleta("negro","gerson","sad","asdfas",2022,4);

        System.out.println(v1);
        System.out.println(a1);

    }
}

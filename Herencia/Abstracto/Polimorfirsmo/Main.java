package Herencia.Abstracto.Polimorfirsmo;

public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos [] = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("GH43","ferrari","A89");
        misVehiculos[1]=new VehiculoTurismo("d","d","d",4);
        misVehiculos[2] = new VehiculoDeportivo("da","sdf","sdf",32);
        misVehiculos[3] = new VehiculoFurgoneta("da","sdf","sdf",32);
        for (Vehiculo vehiculos:misVehiculos
             ) {
            System.out.println(vehiculos.mostrardatos());
            System.out.println("");
        }
        //el polimorfismo son las muchas formas de actuar como puede actuar un objeto dependiendo del contexto como es que lo pongas
    }
}

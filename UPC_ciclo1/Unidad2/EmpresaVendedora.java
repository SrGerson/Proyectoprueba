package UPC_ciclo1.Unidad2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaVendedora {
    private  final  String nombre;
    private final List<Vehiculo> listaVehiculos;

    public EmpresaVendedora(String nombre) {
        this.nombre = nombre;

        listaVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        {
            listaVehiculos.add(vehiculo);
        }
    }
        public void reporteVehiculos() {
            //para cada vehiculo "v" que se encuentre dentro de la listavehichulos
            for (Vehiculo v : listaVehiculos) {
                System.out.println(v);
            }
        }
        public void avanzarVehiculos()
    {
        for (Vehiculo v:listaVehiculos
             ) {
           v.avanzar();
        }

    }
    public void preciventa(){

        for (Vehiculo v:listaVehiculos
             ) {
            // Imprime el mensaje "Precio de venta del " seguido del nombre de la clase del vehículo
            System.out.println("Precio de venta del " + v.getClass().getSimpleName() + ": " + v.getPrecioventa());
            // Usamos v.getClass().getSimpleName() para obtener el nombre de la clase sin complicaciones
            // Imprime el precio de venta del vehículo utilizando el método getPrecioventa()
        }
    }


    }


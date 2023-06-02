package UPC_ciclo1.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Bono {
    private String nombre;
    private List<Vendedores> listavendedores;

    public Bono(String nombre) {
        this.nombre = nombre;
        listavendedores = new ArrayList<>();

    }

    public  String agregarVendedor(String vendedor) {
      //  boolean encontrado = false;
        for (Vendedores vendedor_a : listavendedores) {
            if (vendedor.equals(vendedor_a.getCodigo())) {
                System.out.println("el codigo " + vendedor + "ya existe: ");
            //    encontrado = true;
                break;
            }
        }
        //if (!encontrado)
          //  listavendedores.add(vendedor);
    return vendedor;
    }


/*
        public double calcularPromedioBonoTradicional() {
            double sumaBonos = 0;
            for (Vendedores vendedor : listavendedores ){
                sumaBonos += vendedor.calcularBonoTradicional();

            }
            return sumaBonos / listavendedores.size();

        }

 */
    }



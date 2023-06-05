package CodeGer.practias;

public class Main {
    public static void main(String[] args)
    {

        Celular celular = new Celular("Celular",23,12,"samsung","s22ultra");


        int cantidadDesada=5;
        double precioTotal=celular.calcularTotal(cantidadDesada);

        System.out.println("\nnombre " +celular.getNombre());
        System.out.println("precio "+celular.getPrecio());
        System.out.println("marca "+celular.getMarca());
        System.out.println("precio "+celular.getPrecio());
        System.out.println("precio total (" +  cantidadDesada+" unidades )" + precioTotal);



    }
}

package UPC_ciclo1.Unidad2.PC1;

public class Sedan extends Autos {
    private String suspension;
    private double precioBase;


    public Sedan(String marca, String material, String transmision, double cilindrada, String tipo, String suspension,double precioBase) {
        super(marca, material, transmision, cilindrada, tipo);
        this.suspension = suspension;
        this.precioBase = precioBase;
    }






    public double getPrecioBase() {
        return 25000;
    }




    @Override
    public String toString() {
        return  imprimirmensaje() +
                "suspension='" + suspension + '\'' +
                '}';
    }

    @Override
    public double obtenerPreciofinal() {
       double precioFianl = 0;
        precioBase =getPrecioBase();
        switch (suspension) {
            case "posterior" -> precioFianl= precioBase + 1400;
            case "delantera" -> precioFianl= precioBase + 1500;
            case "doble" ->  precioFianl= precioBase + 1800;
            default -> {
            }
        }
        return precioFianl;
    }



    }




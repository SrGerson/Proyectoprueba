package UPC_ciclo1.Unidad2.PC1;

public abstract    class Autos {
private String marca;
/*
 deberían ser declarados como protected en lugar de private,
  para que las clases hijas puedan acceder a ellos directamente
   sin necesidad de utilizar getters y setters.
 */
protected String material;
protected String transmision;
protected double cilindrada;
protected String tipo;

    public Autos(String marca, String material, String transmision, double cilindrada, String tipo) {
        this.marca = marca;
        this.material = material;
        this.transmision = transmision;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Autos{" +imprimirmensaje()+

                '}';
    }
    public String imprimirmensaje(){
       return  "marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", transmision='" + transmision + '\'' +
                ", cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' ;
    }

    public abstract  double obtenerPreciofinal();





}

package UPC_unidad_1;

public class Main {
    public static void main(String[] args) {
        Caballo  caballo1 = new Caballo("NEGRO","DEPASO","tipo1","grande",'h');
        caballo1.setColor("azul");
        System.out.println("el color del caballo es: " +caballo1.getColor());
        caballo1.setRaza("depaso");
        System.out.println("la raza del caballo es: " + caballo1.getRaza());
        caballo1.setTamaño("grande");
        System.out.println("el tamaño del caballo es: " + caballo1.getTamaño());
        caballo1.setSexo('H');
        System.out.println("el sexo del caballo es: " + caballo1.getSexo());
        caballo1.setTipo("tipo1");
        System.out.println("el tipo del caballo es: " + caballo1.getTipo());
        caballo1.setVelocidadmax(89);
        if (caballo1.getVelocidadmax()<90){
            caballo1.setVelocidadmax(90);
            System.out.println("la velocidad maxima del caballo es: " +  caballo1.getVelocidadmax());
        }
        // cuando quiero imprimir el objeto como el de abajo , me voy a la clase Caballo y pongo generate toString();
        System.out.println("los datos del caballo son: " + caballo1);



    }
}

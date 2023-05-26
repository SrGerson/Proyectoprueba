package Herencia.Sobre_escritura;

public class  Persona extends Animal {
    //la notación override significa que estamos sobre escribiendo el metodo comer
    // se puede hacer desde la clase padre a la clase hija
    @Override
    public void comer (){

        System.out.println("estoy comiendo con cubiertos");
    }
}

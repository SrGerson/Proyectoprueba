package Herencia.Sobre_escritura;

public class Main {
    public static void main(String[] args) {
        Animal animal =new Animal();
        Persona persona = new Persona();
        Perro perro = new Perro();
        animal.comer();
        perro.comer();
        persona.comer();
    }
}

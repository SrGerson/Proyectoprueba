package ATS;

public class Persona {
    // Atributos
    String nombre;
    int edad;
    String dni;
    int banco;


    public Persona(String nombre,String dni) {
        this.nombre = nombre;
        this.dni =dni;
    }

    public Persona(int edad,int banco) {
        this.banco=banco;
        this.edad = edad;
    }




}



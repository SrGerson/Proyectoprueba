package Herencia;

public class Persona {
    /* se puede usa el modificador de acceso protected
    se puede acceder tanto el clase madre y la hija
    en este de la clase  madre es Persona y la hija estudiante
    */
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}

package Herencia;
//extends es hereda, Estudiante hereda de la clase persona
public class Estudiante extends Persona {
    private int codigo_estudiante;
    private float notafinal;
// creamos un constructor especial
    public Estudiante(String nombre, String apellido, int edad, int codigo_estudiante,float notafinal){
        //super es para traer los atributos que ya estan inicializado en otra clase
        super(nombre,apellido,edad);
        this.codigo_estudiante=codigo_estudiante;
        this.notafinal=notafinal;

    }
    public void mostrardatos(){
        System.out.println("nombre: " + getNombre ()
                +" \nApellido: "+ getApellido() +
                " \nEdad: " + getEdad() +
                "\nel codigo de estudiante es: " + codigo_estudiante +
                "\nNota Final estudiante: " + notafinal);
    }
}

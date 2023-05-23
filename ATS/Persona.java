package ATS;

public class Persona {
    // Atributos
   private  final String nombre;
   /*la palabra "final " es una constante que no se puede cambiar añadiendo a una variable, esa variable no podra cambiarse
    a lo largo del programa
    estoy escribiendo desde git hub
    ahora estoy escribiendo desde el local

    */
     private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void mostrarResultados(){
        System.out.println("Me llamo: " + nombre + " y tengo: " + edad + " años " );
}





}



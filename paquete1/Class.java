//encapsulamiento y metodos accesores  (getters y setters)
// setter = set = establecer
package paquete1;
// metodo setter : establecemos la edad
public class Class {
    private int edad;
    private String nombre;

    public void setEdad(int edad){
        this.edad=edad;

    }
// metodo getter: mostramos la edad
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

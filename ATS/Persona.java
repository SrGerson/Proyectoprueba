package ATS;

public class Persona {
    // Atributos
    String nombre;
    String edad;
    String dni;
    int banco;


    public Persona(String nombre,String dni) {
        this.nombre = nombre;
        this.dni =dni;
    }

    public Persona(String edad,int banco) {
        this.banco=banco;
        this.edad = edad;


    }

    public  void nombre_edad (){
        System.out.println("Hola me llamo " + nombre + " y mi DNI es " + dni );


    }
    public void dni_banco(){
        System.out.println("Tengo la edad de " + edad + " y la cuenta de mi banco es: S/"+banco );

    }
    public void correr(int km){
        System.out.println("he corrido la cantidad de: " + km + " kilometros ");

    }




}



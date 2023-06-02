package UPC_ciclo1.Ejercicio2;



public class PerrosCorredores {
    private String nombre;
    private  int num_pista;
    private  int velocidadBase;
    private int velocidadFinal;

    public int getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(int velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    public void setNum_pista(int num_pista) {
        this.num_pista = num_pista;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadBase() {
        return velocidadBase;
    }

    public void setVelocidadBase(int velocidadBase) {
        this.velocidadBase = velocidadBase;
    }



    public PerrosCorredores() {
    }

    public PerrosCorredores(String nombre, int num_pista, int velocidad) {
        this.nombre = nombre;
        this.num_pista = num_pista;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_pista() {
        return num_pista;
    }
}


package UPC_unidad_1;

public class Caballo {
    // Atributos
  private   String color;
     private String raza;
     private String tipo;
     private String tamaño;
     private  char sexo;
     private int velocidadmax;

    public Caballo(String color, String raza, String tipo, String tamaño, char sexo) {
        this.color = color;
        this.raza = raza;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setVelocidadmax(int velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }
}

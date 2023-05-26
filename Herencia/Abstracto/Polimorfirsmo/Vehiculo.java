package Herencia.Abstracto.Polimorfirsmo;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    //constructor

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrardatos(){
        return "\nMatricula: " + matricula +"\nMarca:  " + marca +"\nModelo: " + modelo;
    }
}

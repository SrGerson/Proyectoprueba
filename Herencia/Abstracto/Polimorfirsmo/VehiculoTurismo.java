package Herencia.Abstracto.Polimorfirsmo;

public class VehiculoTurismo extends Vehiculo {
    private int nPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    @Override
    public String mostrardatos(){
        return "Matricula: " + matricula +"\nMarca:  " + marca +"\nModelo: " + modelo +
                "\nNumero de Puertas: " + nPuertas;

    }
}

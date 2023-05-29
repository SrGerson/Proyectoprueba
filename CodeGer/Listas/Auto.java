package CodeGer.Listas;

public class Auto {
    String color;
    String placa;

    public Auto(String color, String placa) {
        this.color = color;
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }
    public  String mostrarresultados(){
        return "Auto "+ "Placa: " + placa + "Color: " + color;
    }
}

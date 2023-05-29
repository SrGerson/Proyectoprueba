package UPC_ciclo1.Talleres;

public class Cuadrilatelo {
    private float lado1;
    private float lado2;

    public Cuadrilatelo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatelo(float lado1) {
        this.lado1 = this.lado2= lado1;
    }


    public  float obtenerPerimetro(){
        float perimetro = 2 *(lado1+lado2);
        return perimetro;
    }

    public  float obtenerArea(){
        float area = (lado1 *lado2);
        return area;
    }
}

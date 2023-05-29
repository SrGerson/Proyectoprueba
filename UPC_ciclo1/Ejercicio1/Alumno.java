package UPC_ciclo1.Ejercicio1;

public class Alumno {
    private String codigo;
    private  String nombre;
    private String apellido;

    private double practica01;
    private  double practica02;
    private double practica03;
    private  double exMparcial;
    private double  exMfinal;
/*
    public Alumnos(String codigo, String nombre, String apellido) {
       this.codigo=codigo;
        this.nombre = nombre;
        this.apellido = apellido;

 */

    public Alumno(String codigo, String nombre, String apellido, double practica01, double practica02, double practica03, double exMparcial, double exMfinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.practica01 = practica01;
        this.practica02 = practica02;
        this.practica03 = practica03;
        this.exMparcial = exMparcial;
        this.exMfinal = exMfinal;
    }

    public Alumno(double practica01, double practica02, double practica03, double exMparcial, double exMfinal) {
        this.practica01 = practica01;
        this.practica02 = practica02;
        this.practica03 = practica03;
        this.exMparcial = exMparcial;
        this.exMfinal = exMfinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setExMparcial(double exMparcial) {
        this.exMparcial = exMparcial;
    }

    public double getExMparcial() {
        return exMparcial;
    }

    public double  obtenerpromedioF(){
        double promPrac = practica01+practica02+practica03 / 3.0;
        double promFinal = (promPrac * 0.2) + (exMparcial*0.3)+(exMfinal*0.5);
        return promFinal;

    }

    @Override
    public String toString() {
        return
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", practica01=" + practica01 +
                ", practica02=" + practica02 +
                ", practica03=" + practica03 +
                ", exMparcial=" + exMparcial +
                ", exMfinal=" + exMfinal +
                "Promedio final: " + obtenerpromedioF()
                ;
    }
}

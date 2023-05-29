package UPC_ciclo1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UPC");
        uni.agregarAlumno(new Alumno("U1","gerson","herrera",12,13.4,16,14.2,11));
        uni.agregarAlumno(new Alumno("U2","Alejandro","romario",12,5,17,12,11));
        uni.agregarAlumno(new Alumno("U1","Alejandro","romario",13,5,17,17,11));
        uni.agregarAlumno(new Alumno("U4","Alejandro","romario",2,5,13,10,11));

        uni.imprimirAlumnos();
       System.out.println("el promedio final es: " + uni.obtenerPromFinal());
       uni.incrementarNotaExamenParcial(12,1);
        System.out.println("");
        uni.imprimirAlumnos();
        uni.incrementarNotaExamenParcial(17,0.5);
        System.out.println("");
        uni.imprimirAlumnos();
        uni.incrementarNotaExamenParcial(18,2);
        System.out.println("");
        uni.imprimirAlumnos();
        System.out.println("");
        System.out.println("Alumndos Aprobados: ");
        uni.ObtenerAlumnosAprobados(14);
        uni.imprimirAlumnos();
        System.out.println("");
        System.out.println("busqueda de Alumnos: ");

        System.out.println(uni.buscarAlumporCodigo("U1"));
        System.out.println(uni.buscarAlumporCodigo("U2"));
        System.out.println(uni.buscarAlumporCodigo("U3"));
        System.out.println(uni.buscarAlumporCodigo("U4"));


    }
}

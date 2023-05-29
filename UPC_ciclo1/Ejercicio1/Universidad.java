package UPC_ciclo1.Ejercicio1;



import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private final String nombre;
    private  final List<Alumno> listaAlumnos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new ArrayList<>();

    }
    public void agregarAlumno(Alumno a ){
        //
        String codigoBuscado = a.getCodigo();
        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (codigoBuscado.equals(alumno.getCodigo())) {
                System.out.println("El código " + codigoBuscado + " ya existe.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado)
            listaAlumnos.add(a);

    }
    public  void imprimirAlumnos(){
        int contador=1;
        for ( Alumno a:listaAlumnos
             ) {
            System.out.println( "Alumno "+ contador+": "+a);
            contador++;
        }

    }
    public double obtenerPromFinal(){
        double mayor=0;
        double promFinalAlum=0;
        for (Alumno a:listaAlumnos) {
            promFinalAlum = a.obtenerpromedioF();

            if (promFinalAlum > mayor)
                mayor = promFinalAlum;
        }

        return  mayor;
    }
    public  void incrementarNotaExamenParcial(double nota,double incremento){
        double  nota_alumno;
        for (Alumno a :listaAlumnos
             ) {
            nota_alumno = a.getExMparcial();
            if (nota_alumno==nota) a.setExMparcial(nota_alumno+ incremento);
        }
    }
    public void ObtenerAlumnosAprobados(double minima_notaAprobatoria){
        for (Alumno a:listaAlumnos
             ) {
            if (a.obtenerpromedioF()>=minima_notaAprobatoria)
                System.out.println(a);
        }

    }
    public  Alumno buscarAlumporCodigo(String codigo_buscado){

        Alumno alumnoEncontrado=null;

        for (Alumno a :listaAlumnos
             ) {
            if(a.getCodigo().equals(codigo_buscado)) {
                alumnoEncontrado = a;

                break;
            }
            }

        if (  alumnoEncontrado==null) {
            System.out.println("no se encontró ningun alumno con el codigo " + codigo_buscado);
            return null;
        }else
            return alumnoEncontrado;

    }

}

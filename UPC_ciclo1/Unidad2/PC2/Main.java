package UPC_ciclo1.Unidad2.PC2;

public class Main {
    public static void main(String[] args) {

        Libros ficcion1 =new Ficcion("Ficcion1","Marvel","Ficcion","Ficcion",100,11);
        Libros ficcion2 =new Ficcion("Ficcion2","Marvela","Ficcion","Ficcion",90,9);
        Libros noficcion1 = new NoFiccion("Noficcion1","chinole","Noficcion","Noficcion",120,"racista");
        Libros noficcion2 = new NoFiccion("Noficcion2","perucho","Noficcion","Noficcion",120,"clasismo");
        Libros cienciaficcion1 = new CienciaFiccion("CienciaFiccion","optimus","ciencia","ciencia",12,"12-06.2006","clasica");
        Libros cienciaficcion2 = new CienciaFiccion("CienciaFiccion","megratron","CienciaFiccion","cienciaficcion",120,"12-04","contemporarena");
        Libros romance1 = new Romance("Romance1","locka","romance","romance",124,"Rolando");
        Libros romance2 = new Romance("Romance2","potisusa","romance","romance",1645,"Poto");

        Libreria libreria = new Libreria("Libreria don pepe");

        libreria.agregarLibros(ficcion1);
        libreria.agregarLibros(ficcion2);
        libreria.agregarLibros(noficcion1);
        libreria.agregarLibros(noficcion2);
        libreria.agregarLibros(cienciaficcion1);
        libreria.agregarLibros(cienciaficcion2);
        libreria.agregarLibros(romance1);
        libreria.agregarLibros(romance2);
        libreria.imprimirlibros();
        libreria.preciofinal();
        libreria.cantLibroFiccion();
        libreria.libroMasCaro();



    }
}

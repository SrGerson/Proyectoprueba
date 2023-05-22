package ATS;
//miembros estaticos de una clase
// se le conocen miembros de clase, porque ya no pertenecen a un objeto
//esto es un atributo estatico y ya no se necesita instanciar un objeto
public class Estatico {
private  static String frase= "primera frase";
    public static int sumar(int n1,int n2){
    int suma = n1+n2;
    return suma;
}

    public static void main(String[] args) {

        //cuando se crea un objeto saca una copia de todos aquellos metodos y atributos que no sean estaticos
        System.out.println(Estatico.frase);
        System.out.println(Estatico.sumar(3,5));



    }
}

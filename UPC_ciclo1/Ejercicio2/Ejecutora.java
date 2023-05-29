package UPC_ciclo1.Ejercicio2;
/*
1)	Un casino desea desarrollar un canódromo virtual. Para ello quieren definir a cada uno de los perros corredores.
Estos llevan como identificación un nombre, un número de pista (del 1 al 7) y una velocidad base (entre 1 y 10).
Se necesita que el perro pueda mostrar sus datos de la siguiente manera:

Nombre : <<el nombre del perro>> Número : <<el número del perro>> : Velocidad Actual

En el caso de la velocidad se requiere que se cree un método llamado velocidad de Carrera que permita calcular la velocidad para una carrera particular.
Cada vez que el perro corre puede generar una velocidad diferente. Para ello la fórmula es la siguiente:

Velocidad de Carrera (m/seg) = velocidad base + número aleatorio entre 1 y 10

Para generar el número aleatorio se pide investigar cómo se puede lograr que se genere y con ello desarrollar la fórmula.

Simule la carrera considerando el avance de cada perro por cada segundo.

Muestre finalmente cuanto avanzó cada perro en 40 segundos y quién ganó.
TIPS:

Se debe investigar la generación de valores aleatorios con Java.
Tener en cuenta que los valores de la velocidad son números enteros.

 */
public class Ejecutora {
    public static void main(String[] args) {
       PerrosCorredores perro1 = new PerrosCorredores("Perro01",1,102);
        System.out.println(perro1.generadorAleatorio());



    }
}

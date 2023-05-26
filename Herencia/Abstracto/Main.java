package Herencia.Abstracto;

public class Main {
    public static void main(String[] args) {
        Planta planta = new Planta();
         Animal_herbivoro animalHerbivoro = new Animal_herbivoro();
         Animal_Carnivoro animalCarnivoro = new Animal_Carnivoro();

        animalHerbivoro.alimentarse();
        planta.alimentarse();
        animalCarnivoro.alimentarse();


        }

        }



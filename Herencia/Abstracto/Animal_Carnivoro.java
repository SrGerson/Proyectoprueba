package Herencia.Abstracto;

public class Animal_Carnivoro extends Animal {
    //el override es para sobreescribir metodos
    @Override
    public void alimentarse(){

        System.out.println("el animal carnivoro se alimenta de carne");
    }

}

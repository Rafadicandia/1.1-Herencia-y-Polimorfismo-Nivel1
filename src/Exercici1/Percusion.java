package Exercici1;

public class Percusion extends Instrument {

    Percusion(String name, Double price) {
        super(name, price);
    }

    @Override
    public void play(){
        System.out.println("This is a Percusion Instrument being played");
    }
}

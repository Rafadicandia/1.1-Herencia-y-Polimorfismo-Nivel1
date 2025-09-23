package Exercici1;

public class Strings extends Instrument {

    Strings(String name, Double price) {
        super(name, price);
    }

    @Override
    public void play(){
        System.out.println("This is a Strings Instrument being played");
    }
}

package Exercici1;

public class Wind extends Instrument {

    Wind(String name, Double price) {
        super(name, price);
    }

    @Override
    public void play(){
        System.out.println("This is a Wind Instrument being played");
    }
}

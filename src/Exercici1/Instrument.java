package Exercici1;

public abstract class Instrument {
    String name;
    Double price;

    Instrument(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void play();

    static {
        System.out.println("Carga inicializada");
    }
}

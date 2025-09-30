package Exercici2;


public class Car {
    private static final String  brand = "Nissan";
    private static String model;
    private final int power;

    Car(String model, int power) {

        Car.model = model;
        this.power = power;

    }
    static void brake(){
        System.out.println("The car is braking");
    }

    void accelerate(){
        System.out.println("The car is acceleratig");
    }

}
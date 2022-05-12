package activities;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(){
        this.tyres = 4;
        this.doors = 4;
    }

    public void displayCharacteristics(){

        System.out.println("Color is "+color);
        System.out.println("transmission is "+transmission);
        System.out.println("make is "+make);
        System.out.println("tyres are "+tyres);
        System.out.println("doors are "+doors);

    }

    public void acclerate(){
        System.out.println("Car is moving forward.");
    }

    public void brake(){
        System.out.println("Car has stopped.");
    }

}

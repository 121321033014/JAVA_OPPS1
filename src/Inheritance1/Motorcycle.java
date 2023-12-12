package Inheritance1;

public class Motorcycle extends Vehicle {
    boolean isSportBike;

    Motorcycle(String make, String model, int year,boolean isSportBike) {
        super(make, model, year);
        this.isSportBike = isSportBike;
    }


   void wheelie(){
        System.out.println(make+" "+model+" "+year+" "+isSportBike+" "+"The motorcycle is doing a wheelie.");
    }

}

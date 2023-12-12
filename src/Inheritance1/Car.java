package Inheritance1;

public class Car extends Vehicle{
    int numDoor;

    Car(String make, String model, int year,int numDoor) {
        super(make, model, year);
        this.numDoor = numDoor;
    }


    void drive(){
        System.out.println(make+" "+year+" "+" "+model+" "+numDoor+" "+"The car is in motion.");
    }
}

package Inheritance1;

public class Vehicle {

   String make;
   String model;
   int year;
   Vehicle(String make, String model, int year){
       this.make = make;
       this.model = model;
       this.year = year;
   }
   void start(){
        System.out.println("The vehicle has started.");
    }
}

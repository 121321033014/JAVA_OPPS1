package Inheritance1;

public class Test {
    public static void main(String[] args) {
        Car c = new Car("Suzuki Motor Cor","3 MUVs",2023,4);
        Motorcycle m = new Motorcycle("Jupitor Cor","JupiK5 ",2022,true);
        c.drive();
        m.wheelie();
    }
}

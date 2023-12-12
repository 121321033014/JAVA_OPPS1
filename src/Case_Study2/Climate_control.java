package Case_Study2;

public class Climate_control implements Benifits{

    public void air_quality(){

        System.out.println("This technology measures the air quality in the car cabin with the help of various sensors");
    }
    public void flexibility(){
        System.out.println("The driver and passenger sitting in the front seat have the flexibility to control the temperature separately for themselves.");
    }
    public void temperature_control(){
        System.out.println("You have the option to control temperature levels and intensity of airflow just with a touch");
    }

    @Override
    public void Display_Unit() {
        System.out.println("A touchscreen or display screen that allows users to interact with the system near the AC system");
    }

    @Override
    public void Rear_seat() {
        System.out.println("tiny TVs that fit in the headrests of a vehicle's driver and passenger seats. They are ideal for keeping backseat passengers entertained.");
    }

    @Override
    public void Front_seat() {
        System.out.println("The driver and front passenger have the flexibility of adjusting temperatures separately. ");
    }
}

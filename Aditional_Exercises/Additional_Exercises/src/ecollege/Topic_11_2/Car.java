package ecollege.Topic_11_2;

/**
 * @author Denis Cechina
 */
public class Car extends Vehicle {
    
    private static int carCounter = 0;

    public Car() {
        carCounter++;
    }

    public Car(String manufacturer) {
        super(manufacturer);
        carCounter++;
    }

    public Car(String manufacturer, float engineSize) {
        super(manufacturer, engineSize);
        carCounter++;
    }

    public Car(String manufacturer, float engineSize, String registrationNo) {
        super(manufacturer, engineSize, registrationNo);
        carCounter++;
    }

    public Car(String manufacturer, float engineSize, String registrationNo,
            boolean nct) {
        super(manufacturer, engineSize, registrationNo, nct);
        carCounter++;
    }

    public static int getCarCounter() {
        return carCounter;
    }
    
    public static void printCarCount(){
        System.out.println(carCounter + " cars have been produced.");
    }
    
    @Override
    public String brake(){
        return "Car braking...";
    }
    
   
}

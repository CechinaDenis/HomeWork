package ecollege.Topic_11_2;

/**
 * @author Denis Cechina
 */
public class Main {
    
    public static void main (String [] args){
        Car c1 = new Car("Subaru Hatchback", 53.45F, "89C4545", true);
        System.out.println(c1 + "\n" + c1.brake() + "\n" + c1.accelerate() + "\n");
        
        Car c2 = new Car();
        c2.setManufacturer("Toyota Carola");
        c2.setEngineSize(45.44F);
        c2.setRegistrationNo("90C4545");
        c2.setNct(true);
        System.out.println(c2 + "\n" + c2.brake() + "\n" + c2.accelerate() + "\n");
        Car.printCarCount();
        
        Truck t1 = new Truck("Ford Transit");
        System.out.println("\n" + t1 + "\n" + t1.brake() + "\n" + t1.accelerate()
        + "\n");
        
        Truck t2 = new Truck();
        t2.setManufacturer("Hyndai Pick-Up");
        t2.setEngineSize(89.45F);
        t2.setRegistrationNo("99C5344");
        t2.setNct(true);
        t2.setIsTrailer(false);
        System.out.println("\n" + t2 + "\n" + t2.brake() + "\n" + t2.accelerate()
        + "\n");
        
    }
}

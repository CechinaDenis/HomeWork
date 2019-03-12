package ecollege.Topic_11_2;

/**
 * @author Denis Cechina
 */
public class Truck extends Vehicle{
    
    private boolean isTrailer = false;

    public Truck() {
    }

    public Truck(String manufacturer) {
        super(manufacturer);
    }

    public Truck(String manufacturer, float engineSize) {
        super(manufacturer, engineSize);
    }

    public Truck(String manufacturer, float engineSize, String registrationNo) {
        super(manufacturer, engineSize, registrationNo);
    }

    public Truck(String manufacturer, float engineSize, String registrationNo, 
            boolean nct) {
        super(manufacturer, engineSize, registrationNo, nct);
    }

    public boolean isIsTrailer() {
        return isTrailer;
    }

    public void setIsTrailer(boolean isTrailer) {
        this.isTrailer = isTrailer;
    }
    
    @Override
    public String brake(){
        return "Truck braking…";
    }

    @Override
    public String toString() {
        return super.toString() + "\nHas Trailer? " + isTrailer ;
    }
    
    
}

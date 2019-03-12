package ecollege.Topic_11_2;

/**
 * @author Denis Cechina
 */
public class Vehicle {

    private String manufacturer;
    private float engineSize;
    private String registrationNo;
    private boolean nct;
    
    {
        manufacturer = "not specified";
        engineSize = 0F;
        registrationNo = "not specified";
        nct = false;
    }
    public Vehicle() {

    }

    public Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Vehicle(String manufacturer, float engineSize) {
        this(manufacturer);
        this.engineSize = engineSize;
    }

    public Vehicle(String manufacturer, float engineSize, String registrationNo) {
        this(manufacturer, engineSize);
        this.registrationNo = registrationNo;
    }

    public Vehicle(String manufacturer, float engineSize, String registrationNo, boolean nct) {
        this(manufacturer, engineSize, registrationNo);
        this.nct = nct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public boolean isNct() {
        return nct;
    }

    public void setNct(boolean nct) {
        this.nct = nct;
    }
    
    public String accelerate(){
        return "Accelerating ...";
    }
    public String brake(){
        return "Vehicle braking...";
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + "\nEngineSize: " + engineSize
                + "\nRegistrationNo: " + registrationNo + "\nNCT: " + nct;
    }
    
    
}

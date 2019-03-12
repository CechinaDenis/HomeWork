package ecollege.Topic_11_1;

/**
 * @author Denis Cechina
 */
public class Adult extends Human{
    private String ppsNo;
    private String occupation;
    private boolean isMarried;
    private boolean isCarOwner;

    public String getPpsNo() {
        return ppsNo;
    }

    public void setPpsNo(String ppsNo) {
        this.ppsNo = ppsNo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean isIsCarOwner() {
        return isCarOwner;
    }

    public void setIsCarOwner(boolean isCarOwner) {
        this.isCarOwner = isCarOwner;
    }
    
    public String drive(){
        return "Driving a car safely...";
    }
    
    public String procreate(){
        return "Procreating...";
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nPPS No: " + this.ppsNo + "\nOccupation: " 
                + this.occupation + "\nMarriage Status: " + this.isMarried 
                + "\nCar Owner: " + this.isCarOwner;
    }
}

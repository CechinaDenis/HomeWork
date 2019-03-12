package ecollege.Topic_10;

/**
 * @author Denis Cechina
 */
public class Smartphone {
    public String name;
    public String manufacturer;
    public float price;
    public String releaseDate;
    public float creditRemaining;
    public boolean isFullyCharged;
    public static int count = 0;
    public static float priceSum;
    
    public Smartphone(float price){
        count++;
        priceSum += price;
    }
    
    public Smartphone(String name, String manufacturer, float price, 
            String releaseDate, float creditRemaining, boolean isFullyCharged){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.releaseDate = releaseDate;
        this.creditRemaining = creditRemaining;
        this.isFullyCharged = isFullyCharged;
        count++;
        priceSum += price;
    }
    
    public void makeCall(String noToCall) {
        System.out.println("Dialling number: "+noToCall);
    }
    
    public void topUpCredit(float topUpAmount){
        creditRemaining += topUpAmount;
        System.out.println("You have successfully topped up by: " + topUpAmount
        +"\nYour new balance is: "+creditRemaining);
    }
    
    public void charge(){
        this.isFullyCharged = true;
        System.out.println("The smartphone is now fully re-charged.\n");
    }
    
    @Override
    public String toString(){
        return "Name: "+name+"\nManufacturer: "+manufacturer+"\nPrice: "+price
                +"\nRelease Date: "+releaseDate+"\nCredit Remaining: "
                +creditRemaining+"\nCharge Status: "+isFullyCharged+"\n";
    }
    
    public static void smartphonesAndAveragePrice(){
        System.out.println(count+" smartphones have been created.\nThe average"
                + " price of a smartphone is: "+priceSum/count);
    }
}

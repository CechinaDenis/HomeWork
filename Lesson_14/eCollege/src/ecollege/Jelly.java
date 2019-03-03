package ecollege;

/**
 * @author Denis Cechina
 */
public class Jelly {
    
    String manufacturer, flavaur, expryData;
    float price, noCalories;
    
    public String setInstructions(){
        return "Leave Jelly to set in a cool enviroment for 1 hr";
    }
    
    public String toStringJelly(){
        return "Manufacturer: "+manufacturer+"\nPrice: "+price+"\nFlavour: "+
                flavaur+"\nNo. of Calories: "+noCalories+"\nExpire Date: "+
                expryData+"\n";
    }
 }

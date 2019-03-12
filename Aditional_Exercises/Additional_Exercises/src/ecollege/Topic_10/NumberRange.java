package ecollege.Topic_10;

/**
 * @author Denis Cechina
 */
public class NumberRange {
    public String checkInRange(int lower_range_value, int upper_range_value, 
            int no_to_serch){
        if(no_to_serch>lower_range_value&&no_to_serch<upper_range_value)
            return "No. in range";
        else return "No. not in range";
    }

}

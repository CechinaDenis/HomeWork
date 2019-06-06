package employee_app.gui.service;

/**
 *
 * @author Denis Cechina
 */
public enum Months {

    Jan ("Jan ( 01 )"),
    Feb ("Feb ( 02 )"),
    Mar ("Mar ( 03 )"),
    Apr ("Apr ( 04 )"),
    May ("May ( 05 )"),
    Jun ("Jun ( 06 )"),
    Jul ("Jul ( 07 )"),
    Aug ("Aug ( 08 )"),
    Sep ("Sep ( 09 )"),
    Oct ("Oct ( 10 )"),
    Nov("Nov ( 11 )"),
    Dec("Dec ( 12 )");

    private String value;
    
    private Months (String value){
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
    
    public static Months getByMonthValue(String monthValue){
        for (Months month : Months.values()){
            if(month.value.equals(monthValue)){
                return month;
            }
        }
        throw new IllegalArgumentException("Position Conversion Problem");
    }

}

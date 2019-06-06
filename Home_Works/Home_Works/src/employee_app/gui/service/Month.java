package employee_app.gui.service;

/**
 * @author Denis Cechina
 */
public enum Month {

    Jan("Jan ( 01 )"),
    Feb("Feb ( 02 )"),
    Mar("Mar ( 03 )"),
    Apr("Apr ( 04 )"),
    May("May ( 05 )"),
    Jun("Jun ( 06 )"),
    Jul("Jul ( 07 )"),
    Aug("Aug ( 08 )"),
    Sep("Sep ( 09 )"),
    Oct("Oct ( 10 )"),
    Nov("Nov ( 11 )"),
    Dec("Dec ( 12 )");

    private String value;

    private Month(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Month getByMonthValue(String monthValue) {
        for (Month month : Month.values()) {
            if (month.value.equals(monthValue)) {
                return month;
            }
        }
        throw new IllegalArgumentException("Month Conversion Problem");
    }

}

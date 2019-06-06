package employee_app.gui.service;

import java.text.DecimalFormat;
import java.util.Calendar;

/**
 * @author Denis Cechina
 */
public class EmployeeBirthDate {

    public static String[] getYears() {
        int startYear = Calendar.getInstance().get(Calendar.YEAR);
        int endYear = startYear - 100;
        String[] years = new String[100];
        int y = 0;
        for (int i = startYear; i > endYear; i--) {
            years[y++] = (String.valueOf(i));
        }
        return years;
    }

    public static String[] getDays(int year, String month) {

        DecimalFormat formatter = new DecimalFormat("00");
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        int day;
        
        if (month.equals("Sep") || month.equals("Apr") || month.equals("Jun")
                || month.equals("Nov")) {

            day = 1;
            String[] days = new String[30];

            for (int i = 0; i < 30; i++) {
                days[i] = formatter.format(day++);
            }
            return days;
        } else if (!isLeapYear && month.equals("Feb")) {

            day = 1;
            String[] days = new String[28];

            for (int i = 0; i < 28; i++) {
                days[i] = formatter.format(day++);
            }
            return days;
        } else if (isLeapYear && month.equals("Feb")) {

            day = 1;
            String[] days = new String[29];

            for (int i = 0; i < 29; i++) {
                days[i] = formatter.format(day++);
            }
            return days;
        } else {
            day = 1;
            String[] days = new String[31];

            for (int i = 0; i < 31; i++) {
                days[i] = formatter.format(day++);
            }
            return days;
        }
    }
}

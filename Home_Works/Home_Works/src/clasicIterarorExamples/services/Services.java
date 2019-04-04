package clasicIterarorExamples.services;

import clasicIterarorExamples.Employee;
import java.util.ArrayList;

/**
 * @author Denis Cechina
 */
public class Services {
    
    private static final ArrayList <Employee> EMP_LIST = new ArrayList<>();

    public static  ArrayList<Employee> getEmpList() {
        return EMP_LIST;
    }
}

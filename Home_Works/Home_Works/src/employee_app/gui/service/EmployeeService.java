package employee_app.gui.service;

import employee_app.gui.employee_manager.Employee;
import java.util.ArrayList;

/**
 * @author Denis Cechina
 */
public class EmployeeService {
    
    private static final ArrayList<Employee> EMPLOYEE_LIST  = new ArrayList<>();
    
    public static ArrayList<Employee> getEmpoyeeList(){
        return EMPLOYEE_LIST;
    }
}

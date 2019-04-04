package employee_app.gui.service;

import employee_app.gui.employee_manager.Employee;
import employee_app.gui.employee_manager.Position;
import java.util.ArrayList;

/**
 * @author Denis Cechina
 */
public class EmployeeService {

    private static final ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public static ArrayList<Employee> getEmpoyeeList() {
        return EMPLOYEE_LIST;
    }

    public static void editEmployee(Integer empId, String newName,
            String newSurename, String newBirthDate, String newCountry,
            String newCity, String newStreet, String newZipCode, Position newPosition) {
        int index;
        for (index = 0; index < EMPLOYEE_LIST.size(); index++) {
            if (empId.equals(EMPLOYEE_LIST.get(index).getId())) {
                break;
            }
        }
        EMPLOYEE_LIST.get(index).setName(newName);
        EMPLOYEE_LIST.get(index).setSurname(newSurename);
        EMPLOYEE_LIST.get(index).setBirthdate(newBirthDate);
        EMPLOYEE_LIST.get(index).setCountry(newCountry);
        EMPLOYEE_LIST.get(index).setCity(newCity);
        EMPLOYEE_LIST.get(index).setStreet(newStreet);
        EMPLOYEE_LIST.get(index).setZipCode(newZipCode);
        EMPLOYEE_LIST.get(index).setPosition(newPosition);

    }

    public static void deleteEmployee(Integer empId) {

        int index;

        for (index = 0; index < EMPLOYEE_LIST.size(); index++) {
            if (empId.equals(EMPLOYEE_LIST.get(index).getId())) {
                break;
            }
        }

        EMPLOYEE_LIST.remove(index);
        
        for (; index < EMPLOYEE_LIST.size(); index++) {

            EMPLOYEE_LIST.get(index).setId(empId++);
        }
    }

    public static Employee getById(Integer id) {
        for (Employee emp : EMPLOYEE_LIST) {
            if (emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }
}

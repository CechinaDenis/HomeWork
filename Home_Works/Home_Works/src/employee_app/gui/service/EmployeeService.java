package employee_app.gui.service;

import employee_app.gui.employee_manager.Employee;
import employee_app.gui.employee_manager.Position;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

/**
 * @author Denis Cechina
 */
public class EmployeeService {

    private static EmployeeDao empDao = new EmployeeDao();

    public static int add(Employee emp)
            throws SQLException {

        int affectedRows = empDao.add(emp);
        return affectedRows;
    }

    public static ArrayList<Employee> getAll()
            throws SQLException {

        return empDao.getAll();
    }

    public static int edit(int id, String newName, String newSurname,
            String newBirthDate, String newCountry, String newCity,
            String newStreet, String newZipCode, Position newPosition, int refRow)
            throws SQLException {

        Employee emp = new Employee(newName, newSurname, newBirthDate,
                newCountry, newCity, newStreet, newZipCode, newPosition);
        emp.setId(id);
        emp.setRefRow(refRow);
        return empDao.edit(emp);
    }

    public static int remove(String... params)
            throws SQLException {

        return empDao.remove(params[0], params[1], params[2]);
    }

    public static Employee getByParams(String... params) {
        return empDao.getEmployee(params[0], params[1], params[2]);
    }

    public static void serialization(String filePath)
            throws SQLException, IOException, ParserConfigurationException,
            TransformerException {

        ArrayList<Employee> empList = empDao.getAll();
        if (filePath.toLowerCase().endsWith(".csv")) {
            EmployeeIOService.serializeToCSVFile(empList, filePath);
        } else if (filePath.toLowerCase().endsWith(".xml")) {
            EmployeeIOService.serializeToXMLFile(empList, filePath);
        } else if (filePath.toLowerCase().endsWith(".json")) {
//            EmployeeIOService.serializeToJSONFile(empList, filePath);
        } else {

        }
    }

    public static String fileSave() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }
        return null;
    }

//    private static final ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();
//
//    public static ArrayList<Employee> getEmpoyeeList() {
//        return EMPLOYEE_LIST;
//    }
//
//    public static void editEmployee(Integer empId, String newName,
//            String newSurname, String newBirthDate, String newCountry,
//            String newCity, String newStreet, String newZipCode, Position newPosition) {
//        int index;
//        for (index = 0; index < EMPLOYEE_LIST.size(); index++) {
//            if (empId.equals(EMPLOYEE_LIST.get(index).getId())) {
//                break;
//            }
//        }
//        EMPLOYEE_LIST.get(index).setName(newName);
//        EMPLOYEE_LIST.get(index).setSurname(newSurname);
//        EMPLOYEE_LIST.get(index).setBirthdate(newBirthDate);
//        EMPLOYEE_LIST.get(index).setCountry(newCountry);
//        EMPLOYEE_LIST.get(index).setCity(newCity);
//        EMPLOYEE_LIST.get(index).setStreet(newStreet);
//        EMPLOYEE_LIST.get(index).setZipCode(newZipCode);
//        EMPLOYEE_LIST.get(index).setPosition(newPosition);
//
//    }
//
//    public static void deleteEmployee(Integer empId) {
//
//        int index;
//
//        for (index = 0; index < EMPLOYEE_LIST.size(); index++) {
//            if (empId.equals(EMPLOYEE_LIST.get(index).getId())) {
//                break;
//            }
//        }
//
//        EMPLOYEE_LIST.remove(index);
//
//        for (; index < EMPLOYEE_LIST.size(); index++) {
//
//            EMPLOYEE_LIST.get(index).setId(empId++);
//        }
//    }
//
//    public static Employee getById(Integer id) {
//        for (Employee emp : EMPLOYEE_LIST) {
//            if (emp.getId().equals(id)) {
//                return emp;
//            }
//        }
//        return null;
//    }
}

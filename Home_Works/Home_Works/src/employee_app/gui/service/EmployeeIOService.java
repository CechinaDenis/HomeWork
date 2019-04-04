package employee_app.gui.service;

import employee_app.gui.Main;
import employee_app.gui.employee_manager.Employee;
import employee_app.gui.employee_manager.Position;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Denis Cechina
 */
public class EmployeeIOService {

    public static void serializeToFile(List<Employee> empList, String filePath)
            throws FileNotFoundException, IOException {
        File outputFile = new File(filePath);
        FileOutputStream fileOutStream = new FileOutputStream(outputFile);
        PrintWriter printWriter = new PrintWriter(fileOutStream);
        for (Employee emp : empList) {
            printWriter.println(emp);
        }
        printWriter.flush();
        fileOutStream.close();
        printWriter.close();
    }

    public static void deserializeFromFile(String filePath)
            throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(new File(filePath));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileLine;
        while ((fileLine = bufferedReader.readLine()) != null && bufferedReader.readLine() != "\n") {
            String[] arrOfStr = fileLine.split(",");
            for (String string : arrOfStr) {
                System.out.print(" " + string);
            }
            Employee emp = new Employee(arrOfStr[0], arrOfStr[1],arrOfStr[2],
                    arrOfStr[3],arrOfStr[4],arrOfStr[5], arrOfStr[6]);
            EmployeeService.getEmpoyeeList().add(emp);
            emp.setPosition(Position.getByPositionName(arrOfStr[7]));
            Main.addEmployee(emp);
        }
    }
}

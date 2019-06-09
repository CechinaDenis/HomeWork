package employee_app.gui.service;

import employee_app.gui.employee_manager.Employee;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

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

    public static int edit(Employee emp)
            throws SQLException {

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
            EmployeeIOService.serializeToJSONFile(empList, filePath);
        } else {
            System.err.println("Something wrong dude");
        }
    }

    public static void deserialization(String filePath) throws IOException,
            ParserConfigurationException, SAXException {
        if (filePath.toLowerCase().endsWith(".csv")) {
            EmployeeIOService.deserializeFromCSVFile(filePath);
        } else if (filePath.toLowerCase().endsWith(".xml")) {
            EmployeeIOService.deserializeFromXMLFile(filePath);
        } else if (filePath.toLowerCase().endsWith(".json")) {
            EmployeeIOService.deserializeFromJSONFile(filePath);
        } else {
            System.err.println("Something wrong dude");
        }
    }

    public static String fileSave() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView()
                .getHomeDirectory());

        int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }
        return null;
    }

    public static String fileOpen(String extension) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView()
                .getHomeDirectory());
        jfc.setDialogTitle("Select an " + extension + " File");
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(extension
                + " files", extension);
        jfc.addChoosableFileFilter(filter);

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }
        return null;
    }
}

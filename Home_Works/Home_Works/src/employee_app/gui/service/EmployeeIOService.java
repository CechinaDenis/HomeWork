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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Denis Cechina
 */
public class EmployeeIOService {

    private static final String EMPLOYEELIST_NODE = "employees";
    private static final String EMPLOYEE_NODE = "employee";
    private static final String ID_NODE = "id";
    private static final String NAME_NODE = "name";
    private static final String SURNAME_NODE = "surname";
    private static final String BITHDATE_NODE = "bithDate";
    private static final String COUNTRY_NODE = "country";
    private static final String CITY_NODE = "city";
    private static final String STREET_NODE = "street";
    private static final String ZIPCODE_NODE = "zipCode";
    private static final String POSITION_NODE = "position";

    public static void serializeToCSVFile(List<Employee> empList, String filePath)
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
//
//    public static void deserializeFromCSVFile(String filePath)
//            throws FileNotFoundException, IOException {
//
//        FileReader fileReader = new FileReader(new File(filePath.concat(CSV_EXTENSION)));
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String fileLine;
//        while ((fileLine = bufferedReader.readLine()) != null && !"\n".equals(bufferedReader.readLine())) {
//            String[] arrOfStr = fileLine.split(",");
//            Employee emp = new Employee(arrOfStr[0], arrOfStr[1], arrOfStr[2],
//                    arrOfStr[3], arrOfStr[4], arrOfStr[5], arrOfStr[6]);
//            EmployeeService.getEmpoyeeList().add(emp);
//            emp.setPosition(Position.getByPositionName(arrOfStr[7]));
//            Main.addEmployee(emp);
//        }
//    }
//
    public static void serializeToXMLFile(List<Employee> empList, String filePath)
            throws ParserConfigurationException, TransformerConfigurationException, TransformerException {

        DocumentBuilderFactory domBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder domBuilder = domBuilderFactory.newDocumentBuilder();
        Document doc = domBuilder.newDocument();
        Element root = doc.createElement(EMPLOYEELIST_NODE);
        doc.appendChild(root);
        for (Employee emp : empList) {
            Element employee = doc.createElement(EMPLOYEE_NODE);
            root.appendChild(employee);
            Element id = doc.createElement(ID_NODE);
            id.appendChild(doc.createTextNode(String.valueOf(emp.getId())));
            employee.appendChild(id);
            Element name = doc.createElement(NAME_NODE);
            name.appendChild(doc.createTextNode(emp.getName()));
            employee.appendChild(name);
            Element surname = doc.createElement(SURNAME_NODE);
            surname.appendChild(doc.createTextNode(emp.getSurname()));
            employee.appendChild(surname);
            Element bithDate = doc.createElement(BITHDATE_NODE);
            bithDate.appendChild(doc.createTextNode(emp.getBirthDate()));
            employee.appendChild(bithDate);
            Element country = doc.createElement(COUNTRY_NODE);
            country.appendChild(doc.createTextNode(emp.getCountry()));
            employee.appendChild(country);
            Element city = doc.createElement(CITY_NODE);
            city.appendChild(doc.createTextNode(emp.getCity()));
            employee.appendChild(city);
            Element street = doc.createElement(STREET_NODE);
            street.appendChild(doc.createTextNode(emp.getStreet()));
            employee.appendChild(street);
            Element ZIPCode = doc.createElement(ZIPCODE_NODE);
            ZIPCode.appendChild(doc.createTextNode(emp.getZipCode()));
            employee.appendChild(ZIPCode);
            Element position = doc.createElement(POSITION_NODE);
            position.appendChild(doc.createTextNode(emp.getPosition().getName()));
            employee.appendChild(position);
        }

        doc.getDocumentElement().normalize();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult destination = new StreamResult(new File(filePath));
        transformer.transform(source, destination);
    }
//
//    public static void deserializeFromXMLFile(String filePath)
//            throws ParserConfigurationException, SAXException, IOException {
//
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document xmlDoc = dBuilder.parse(filePath.concat(XML_EXTENSION));
//        xmlDoc.getDocumentElement().normalize();
//
//        NodeList newList = xmlDoc.getElementsByTagName(EMPLOYEE_NODE);
//
//        for (int i = 0; i < newList.getLength(); i++) {
//            Node newNode = newList.item(i);
//            if (newNode.getNodeType() == Node.ELEMENT_NODE) {
//                Element eElement = (Element) newNode;
//
//                Employee emp = new Employee(
//                        eElement.getElementsByTagName(NAME_NODE).item(0)
//                                .getTextContent(),
//                        eElement.getElementsByTagName(SURNAME_NODE).item(0)
//                                .getTextContent(),
//                        eElement.getElementsByTagName(BITHDATE_NODE).item(0)
//                                .getTextContent(),
//                        eElement.getElementsByTagName(COUNTRY_NODE).item(0)
//                                .getTextContent(),
//                        eElement.getElementsByTagName(CITY_NODE).item(0)
//                                .getTextContent(),
//                        eElement.getElementsByTagName(STREET_NODE).item(0)
//                                .getTextContent(),
//                        eElement.getElementsByTagName(ZIPCODE_NODE).item(0)
//                                .getTextContent());
//                EmployeeService.getEmpoyeeList().add(emp);
//                emp.setPosition(Position.getByPositionName(
//                        eElement.getElementsByTagName(POSITION_NODE).item(0)
//                                .getTextContent()));
//                Main.addEmployee(emp);
//            }
//        }
//    }
}

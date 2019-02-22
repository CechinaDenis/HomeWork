package employeemanager;
import employeemanager.models.Employee;
import employeemanager.models.implementations.*;


/**
 *
 * @author Denis Cechina
 */
public class App {
    
    public static void main(String[] args) {
        
        Employee pr1 = new Employee();
        pr1.setAge(10);
        int age = pr1.getAge();
        System.out.println(age);
        Programmer prg1 = new Programmer();
        prg1.newProgrammer();
        
        
        
    
    }
    
}

package employee_app.gui.employees;

import employee_app.gui.employee_manager.Employee;

/**
 * @author Denis Cechina
 */
public class Manager extends Employee {
    
    public Manager(String name, String surname){
        super(name, surname);
    }

    public Manager(String name, String surname, String birthdate) {
        super(name, surname, birthdate);
    }

    public Manager(String name, String surname, String birthdate, String country) {
        super(name, surname, birthdate, country);
    }

    public Manager(String name, String surname, String birthdate, String country, 
            String city) {
        super(name, surname, birthdate, country, city);
    }

    public Manager(String name, String surname, String birthdate, String country, 
            String city, String Street) {
        super(name, surname, birthdate, country, city, Street);
    }

    public Manager(String name, String surname, String birthdate, String country, 
            String city, String Street, String zipCode) {
        super(name, surname, birthdate, country, city, Street, zipCode);
    }
}

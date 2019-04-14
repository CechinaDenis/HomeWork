package employee_app.gui.employees;

import employee_app.gui.employee_manager.Employee;

/**
 * @author Denis Cechina
 */
public class Technician extends Employee {
                
    public Technician(String name, String surname){
        super(name, surname);
    }

    public Technician(String name, String surname, String birthdate) {
        super(name, surname, birthdate);
    }

    public Technician(String name, String surname, String birthdate, 
            String country) {
        super(name, surname, birthdate, country);
    }

    public Technician(String name, String surname, String birthdate, 
            String country, String city) {
        super(name, surname, birthdate, country, city);
    }

    public Technician(String name, String surname, String birthdate, 
            String country, String city, String Street) {
        super(name, surname, birthdate, country, city, Street);
    }

    public Technician(String name, String surname, String birthdate, 
            String country, String city, String Street, String zipCode) {
        super(name, surname, birthdate, country, city, Street, zipCode);
    }
}

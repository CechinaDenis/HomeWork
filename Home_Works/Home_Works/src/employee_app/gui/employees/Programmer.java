package employee_app.gui.employees;

import employee_app.gui.employee_manager.Employee;

/**
 * @author Denis Cechina
 */
public class Programmer extends Employee {
        
    public Programmer(String name, String surename){
        super(name, surename);
    }

    public Programmer(String name, String surname, String birthdate) {
        super(name, surname, birthdate);
    }

    public Programmer(String name, String surname, String birthdate, 
            String country) {
        super(name, surname, birthdate, country);
    }

    public Programmer(String name, String surname, String birthdate, 
            String country, String city) {
        super(name, surname, birthdate, country, city);
    }

    public Programmer(String name, String surname, String birthdate, 
            String country, String city, String Street) {
        super(name, surname, birthdate, country, city, Street);
    }

    public Programmer(String name, String surname, String birthdate, 
            String country, String city, String Street, String zipCode) {
        super(name, surname, birthdate, country, city, Street, zipCode);
    }
}

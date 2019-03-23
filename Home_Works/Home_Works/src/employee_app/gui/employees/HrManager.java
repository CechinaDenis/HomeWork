package employee_app.gui.employees;

import employee_app.gui.employee_manager.Employee;

/**
 * @author Denis Cechina
 */
public class HrManager extends Employee {
                
    public HrManager(String name, String surename){
        super(name, surename);
    }

    public HrManager(String name, String surname, String birthdate) {
        super(name, surname, birthdate);
    }

    public HrManager(String name, String surname, String birthdate, 
            String country) {
        super(name, surname, birthdate, country);
    }

    public HrManager(String name, String surname, String birthdate, 
            String country, String city) {
        super(name, surname, birthdate, country, city);
    }

    public HrManager(String name, String surname, String birthdate, 
            String country, String city, String Street) {
        super(name, surname, birthdate, country, city, Street);
    }

    public HrManager(String name, String surname, String birthdate, 
            String country, String city, String Street, String zipCode) {
        super(name, surname, birthdate, country, city, Street, zipCode);
    }
}

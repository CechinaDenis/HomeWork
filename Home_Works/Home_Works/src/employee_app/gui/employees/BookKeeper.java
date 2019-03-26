package employee_app.gui.employees;

import employee_app.gui.employee_manager.Employee;

/**
 * @author Denis Cechina
 */
public class BookKeeper extends Employee{
    
    public BookKeeper(String name, String surename){
        super(name, surename);
    }

    public BookKeeper(String name, String surname, String birthdate) {
        super(name, surname, birthdate);
    }

    public BookKeeper(String name, String surname, String birthdate, 
            String country) {
        super(name, surname, birthdate, country);
    }

    public BookKeeper(String name, String surname, String birthdate, 
            String country, String city) {
        super(name, surname, birthdate, country, city);
    }

    public BookKeeper(String name, String surname, String birthdate, 
            String country, String city, String Street) {
        super(name, surname, birthdate, country, city, Street);
    }

    public BookKeeper(String name, String surname, String birthdate, 
            String country, String city, String Street, String zipCode) {
        super(name, surname, birthdate, country, city, Street, zipCode);
    }
}

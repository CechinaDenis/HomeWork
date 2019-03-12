package employee_app.main.employees;

import employee_app.main.employee_manager.Employee;

/**
 * @author Denis Cechina
 */
public class BookKeeper extends Employee {

    public BookKeeper() {

    }

    public BookKeeper(String surename) {
        super(surename);
    }

    public BookKeeper(String surename, String birthDate) {
        super(surename, birthDate);
    }

    public BookKeeper(String surename, String birthDate, long idnp) {
        super(surename, birthDate, idnp);
    }

    public BookKeeper(String surename, String birthDate, long idnp, String street, short house, byte block, short apartment) {
        super(surename, birthDate, idnp, street, house, block, apartment);
    }

    @Override
    public void working() {
        System.out.println("I'm working in BookKeeper's department");
    }
}

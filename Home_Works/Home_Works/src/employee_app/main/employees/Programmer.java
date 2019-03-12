package employee_app.main.employees;

import employee_app.main.employee_manager.Employee;

/**
 * @author Denis Cechina
 */
public class Programmer extends Employee {

    public Programmer() {

    }

    public Programmer(String surename) {
        super(surename);
    }

    public Programmer(String surename, String birthDate) {
        super(surename, birthDate);
    }

    public Programmer(String surename, String birthDate, long idnp) {
        super(surename, birthDate, idnp);
    }

    public Programmer(String surename, String birthDate, long idnp, String street, short house, byte block, short apartment) {
        super(surename, birthDate, idnp, street, house, block, apartment);
    }

    @Override
    public void working() {
        System.out.println("I'm working in Programmer's department");
    }
}

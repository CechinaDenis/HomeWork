package app.employeemanager.employees;

import app.employeemanager.Employee;

/**
 * @author Denis Cechina
 */
public class Manager extends Employee {

    public Manager() {

    }

    public Manager(String surename) {
        super(surename);
    }

    public Manager(String surename, String birthDate) {
        super(surename, birthDate);
    }

    public Manager(String surename, String birthDate, long idnp) {
        super(surename, birthDate, idnp);
    }

    public Manager(String surename, String birthDate, long idnp, String street, short house, byte block, short apartment) {
        super(surename, birthDate, idnp, street, house, block, apartment);
    }

    @Override
    public void working() {
        System.out.println("I'm working in Manager's department");
    }
}

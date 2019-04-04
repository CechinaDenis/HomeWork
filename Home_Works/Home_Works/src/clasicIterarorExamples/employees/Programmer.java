package clasicIterarorExamples.employees;

import clasicIterarorExamples.Employee;

/**
 * @author Denis Cechina
 */
public class Programmer extends Employee {

    public Programmer(String name) {
        super(name);
    }

    public Programmer(String name, String surename) {
        super(name, surename);
    }

    public Programmer(String name, String surename, String birthDate) {
        super(name, surename, birthDate);
    }
    
}

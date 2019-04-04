
package clasicIterarorExamples.employees;

import clasicIterarorExamples.Employee;

/**
 * @author Denis Cechina
 */
public class Technician extends Employee{

    public Technician(String name) {
        super(name);
    }

    public Technician(String name, String surename) {
        super(name, surename);
    }

    public Technician(String name, String surename, String birthDate) {
        super(name, surename, birthDate);
    }

}

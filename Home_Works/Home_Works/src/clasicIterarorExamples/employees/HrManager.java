
package clasicIterarorExamples.employees;

import clasicIterarorExamples.Employee;

/**
 * @author Denis Cechina
 */
public class HrManager extends Employee {

    public HrManager(String name) {
        super(name);
    }

    public HrManager(String name, String surename) {
        super(name, surename);
    }

    public HrManager(String name, String surename, String birthDate) {
        super(name, surename, birthDate);
    }

}

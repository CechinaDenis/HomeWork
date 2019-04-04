package clasicIterarorExamples;

/**
 * @author Denis Cechina
 */
public class Employee {

    private static int id = 1;
    private final int ID;
    private String name;
    private String surename;
    private String birthDate;

    public Employee(String name) {
        this.name = name;
        ID = id++;
    }

    public Employee(String name, String surename) {
        this(name);
        this.surename = surename;
    }

    public Employee(String name, String surename, String birthDate) {
        this(name, surename);
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "\nEmployee{ID=" + ID + " Name=" + name + ", Surename=" + surename + ", BirthDate=" + birthDate + '}';
    }
}
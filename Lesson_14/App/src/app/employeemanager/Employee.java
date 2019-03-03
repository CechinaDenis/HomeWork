package app.employeemanager;

/**
 * @author Denis Cechina
 */
public abstract class Employee {
    //Instance Variable
    protected String name, surename, birthDate, street;
    protected long idnp;
    protected byte block;
    protected short house, apartment;
    
    public Employee(){//Default Constructor
        
    }
    
        public Employee(String surename) {
        this.surename = surename;
    }

    public Employee(String surename, String birthDate) {
        this(surename);
        this.birthDate = birthDate;
    }

    public Employee(String surename, String birthDate, long idnp) {
        this(surename, birthDate);
        this.idnp = idnp;
    }

    public Employee(String surename, String birthDate, long idnp, String street, short house, byte block, short apartment) {
        this(surename, birthDate, idnp);
        this.street = street;
    }
    
    public void show() {
        System.out.println("Surename: " + surename + "\nName: " + name + 
                "\nBirth Date: " + birthDate + "\nIDNP: " + idnp + "\nAdress: " +
                street + " " + house + "\\" + block + " ap. " + apartment);
    }
    
    public void displayName(){
        System.out.println("Surename: " + surename);
    }
    public void displaySurename(){
        System.out.println("Name: " + name);
    }
    public void displayBirthDate(){
        System.out.println("Birth Date: " + birthDate);
    }
    public void displayIDNP(){
        System.out.println("IDNP: " + idnp);
    }
    public void displayAdress(){
        System.out.println("Adress: " +street + " " + house + "\\" + block + " ap. " + apartment);
    }
    
    public abstract void working();
}

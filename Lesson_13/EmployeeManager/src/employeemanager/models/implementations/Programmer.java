/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.models.implementations;
import employeemanager.models.Employee;

/**
 *
 * @author Admin
 */
public class Programmer extends Employee{
    public Programmer(){
        System.out.println("Hello, I am a new Programmer");
    }
    
    public void newProgrammer(){
        name = "assdfs";
        surname = "kjnnkj";
        System.out.println(name);
    }
}

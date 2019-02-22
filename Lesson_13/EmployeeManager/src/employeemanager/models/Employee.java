/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.models;

/**
 *
 * @author Admin
 */
public class Employee{
    
    protected String name;
    public String surname;
    private int age;
    
    public void  setAge(int ag){
        age = ag;
    }
    
    public int getAge(){
        return age;
    }

    
}

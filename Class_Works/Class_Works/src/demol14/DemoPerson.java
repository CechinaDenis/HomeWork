/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demol14;

/**
 *
 * @author Admin
 */
public class DemoPerson {
    String name, surename;
    int age;
    
    public DemoPerson(){
        
    }
    
    public DemoPerson(String name, String surename){
        this.name = name;
        this.surename = surename;
    }
    
    public DemoPerson(String name, String surename, int age){
        this.name = name;
        this.surename = surename;
        this.age = age;
    }
    
    public void show(){
        System.out.println("Name: "+this.name+" Surename: "+this.surename+" Age: "+this.age);
    }
}

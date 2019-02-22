/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.employeemanager.employees.*;

/**
 * @author Denis Cechina
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programmer prg1 = new Programmer("Ccehina");
        prg1.show();
        prg1.displayName();
        prg1.displaySurename();
        prg1.displayBirthDate();
        prg1.displayIDNP();
        prg1.displayAdress();
    }
    
}

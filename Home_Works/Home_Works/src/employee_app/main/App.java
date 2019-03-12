package employee_app.main;

import employee_app.main.employees.*;
/**
 * @author Denis Cechina
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programmer prg1 = new Programmer("Cechina");
        prg1.show();
        prg1.displayName();
        prg1.displaySurename();
        prg1.displayBirthDate();
        prg1.displayIDNP();
        prg1.displayAdress();
        
    }
    
}

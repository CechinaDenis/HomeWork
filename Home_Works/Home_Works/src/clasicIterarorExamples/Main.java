package clasicIterarorExamples;

import clasicIterarorExamples.employees.HrManager;
import clasicIterarorExamples.employees.Programmer;
import clasicIterarorExamples.employees.Technician;
import clasicIterarorExamples.services.Services;

/**
 * @author Denis Cechina
 */
public class Main {

    public static void main(String[] args) {

        Employee emp = new Programmer("ion0", "vasea0", "2000-01-01");
        Services.getEmpList().add(emp);
        Employee emp1 = new HrManager("ion1", "vasea1", "2001-02-02");
        Services.getEmpList().add(emp1);
        Employee emp2 = new Technician("ion2", "vasea2", "2002-03-03");
        Services.getEmpList().add(emp2);

        int i = 0;
        while (i < Services.getEmpList().size()) {
            System.out.println("Name = " + Services.getEmpList().get(i++)
                    .getName());
        }

        i = 0;
        while (i < Services.getEmpList().size()) {
            System.out.println("Surename = " + Services.getEmpList().get(i++)
                    .getSurename());
        }

        i = 0;
        while (i < Services.getEmpList().size()) {
            System.out.println("Birth Date = " + Services.getEmpList().get(i++)
                    .getBirthDate());
        }

        i = 0;
        do {
            if (i < Services.getEmpList().size()) {
                System.out.println("Name = " + Services.getEmpList().get(i++)
                        .getName());
            }
        } while (i < Services.getEmpList().size());

        i = 0;
        do {
            if (i < Services.getEmpList().size()) {
                System.out.println("Surename = " + Services.getEmpList().get(i++)
                        .getSurename());
            }
        } while (i < Services.getEmpList().size());
        i = 0;

        do {
            if (i < Services.getEmpList().size()) {
                System.out.println("Birth Date = " + Services.getEmpList()
                        .get(i++).getBirthDate());
            }
        } while (i < Services.getEmpList().size());

        for (i = 0; i < Services.getEmpList().size(); i++) {
            System.out.println("Name = " + Services.getEmpList().get(i).getName());
        }

        for (i = 0; i < Services.getEmpList().size(); i++) {
            System.out.println("Surename = " + Services.getEmpList().get(i)
                    .getSurename());
        }

        for (i = 0; i < Services.getEmpList().size(); i++) {
            System.out.println("Birth Date = " + Services.getEmpList().get(i)
                    .getBirthDate());
        }
    }
}

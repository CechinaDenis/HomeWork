/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.employeemanager.employees;

import app.employeemanager.Employee;

/**
 * @author Denis Cechina
 */
public class Salesman extends Employee {

    public Salesman() {

    }

    public Salesman(String surename) {
        this.surename = surename;
    }

    public Salesman(String surename, String birthDate) {
        this(surename);
        this.birthDate = birthDate;
    }

    public Salesman(String surename, String birthDate, long idnp) {
        this(surename, birthDate);
        this.idnp = idnp;
    }

    public Salesman(String surename, String birthDate, long idnp, String street, short house, byte block, short apartment) {
        this(surename, birthDate, idnp);
        this.street = street;
    }
}

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
public class BookKeeper extends Employee {

    public BookKeeper() {

    }

    public BookKeeper(String surename) {
        this.surename = surename;
    }

    public BookKeeper(String surename, String birthDate) {
        this(surename);
        this.birthDate = birthDate;
    }

    public BookKeeper(String surename, String birthDate, long idnp) {
        this(surename, birthDate);
        this.idnp = idnp;
    }

    public BookKeeper(String surename, String birthDate, long idnp, String street, short house, byte block, short apartment) {
        this(surename, birthDate, idnp);
        this.street = street;
    }
}

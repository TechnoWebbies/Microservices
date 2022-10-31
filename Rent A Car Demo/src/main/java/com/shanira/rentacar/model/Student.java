package com.shanira.rentacar.model;

import javax.persistence.*;


@Table(name = "student")
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastName;
    }

    public void setLastNAme(String lastNAme) {
        this.lastName = lastNAme;
    }
}

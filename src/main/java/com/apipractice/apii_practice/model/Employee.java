package com.apipractice.apii_practice.model;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="First_name")
    private String Firstname;
    @Column(name="Last_name")
    private String Lastname;
    @Column(name="email")
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }


    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
        super();
    }
    public Employee(String firstname, String lastname, String email) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.email = email;
    }
}

package com.devops.inventory.model;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "type")
    private String type;

    @Column(name = "high_privileges")
    private boolean highPrivileges;

    // Default constructor
    public user() {
    }

    // Parameterized constructor
    public user(int id, String firstName, String lastName, String type, boolean highPrivileges) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.highPrivileges = highPrivileges;
    }

    // Getters and Setters
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean hasHighPrivileges() {
        return highPrivileges;
    }

    public void setHighPrivileges(boolean highPrivileges) {
        this.highPrivileges = highPrivileges;
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "User  {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type='" + type + '\'' +
                ", highPrivileges=" + highPrivileges +
                '}';
    }
}
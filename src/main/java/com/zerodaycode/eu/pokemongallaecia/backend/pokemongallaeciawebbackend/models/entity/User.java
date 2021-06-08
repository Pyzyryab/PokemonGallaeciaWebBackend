package com.zerodaycode.eu.pokemongallaecia.backend.pokemongallaeciawebbackend.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    // Account data
    private String username;
    private String password;
    private String email;

    // User personal data
    private String name;

    @Column(name = "last_name")
    private String lastName;
    
    // Account details
    @Column(name = "account_creation_date")
    @Temporal(TemporalType.DATE)
    private Date accountCreationDate;

    // The relation with the Gamer table
    @JoinColumn(name = "id", referencedColumnName = "gamerId")
    @OneToOne
    private Gamer gamer;

    //! Empty constructor for the Java Beans requisite
    public User() {}

    //! By ID constructor
    public User(Integer id) {
        this.id = id;
    }

    // //! Getters and Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public String toString() {
        return "User [accountCreationDate=" + accountCreationDate + ", email=" + email + ", id=" + id + ", lastName="
                + lastName + ", name=" + name + ", password=" + password + ", username=" + username + "]";
    }

    

}

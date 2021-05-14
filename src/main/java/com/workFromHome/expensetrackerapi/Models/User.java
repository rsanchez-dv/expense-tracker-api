package com.workFromHome.expensetrackerapi.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;

    public User(String email,String password){
        this.email = email;
        this.password = password;
    }
    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}
    public String getPassword() { return password;}
    public void setPassword(String password) {this.password = password;}
}

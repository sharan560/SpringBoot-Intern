package com.example.Springbootfirstproject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empid;
    private String ename;
    private String email;
    private String password;
    private String dob;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserDetails() {

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public UserDetails(int empid, String ename, String email, String password, String dob, String role) {
        this.empid = empid;
        this.ename = ename;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.role = role;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBob() {
        return dob;
    }

    public void setBob(String bob) {
        this.dob = bob;
    }
}

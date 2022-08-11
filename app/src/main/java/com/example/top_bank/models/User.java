package com.example.top_bank.models;

public class User {
    private int id;
    private String fname,lname,email,phone,account,pin;

    public User(int id, String fname, String lname, String email, String phone, String account, String pin) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.account = account;
        this.pin = pin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

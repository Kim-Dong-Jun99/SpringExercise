package com.goweb.springexercise.gcurest;


import java.util.Date;

public class User {
    private Long id;
    private String name;
    private Date dob;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public User(Long id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User {" + "id= " + id + ", name= " + name + ", dob= " + dob + "}";
    }
}

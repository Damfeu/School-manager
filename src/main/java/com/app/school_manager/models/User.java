package com.app.school_manager.models;

import com.app.school_manager.interfaces.UserInterface;

import java.sql.SQLException;
import java.util.List;

public abstract class User implements UserInterface {
    private int id;
    private int password;
    private String e_mail;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }


    @Override
    public List<User> list() throws SQLException {
        return null;
    }

    public abstract void create(Student student) throws SQLException;
}



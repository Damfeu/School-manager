package com.app.school_manager.models;

import com.app.school_manager.dbconfig.IDBConfig;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Student extends User   {
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private int state=0;
    private int classroomId;




    private Connection connection;
    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }




    /*@Override
    public List<Student> list() throws SQLException {
        return null;
    }*/

    @Override
    public void create(Student student) throws SQLException {
        this.connection = IDBConfig.getConnection();
        if(connection != null){
            String req = "INSERT INTO student(firstname, lastname, dateOfBirth, placeOfBirth, state, classroom_id) VALUES (?,?,?,?,?,?);";


            PreparedStatement prepareStatement = this.connection.prepareStatement(req);

            prepareStatement.setString(1, getFirstname());
            prepareStatement.setString(2, getLastname());
            prepareStatement.setDate(3, Date.valueOf(getDateOfBirth()));
            prepareStatement.setString(4, getPlaceOfBirth());
            prepareStatement.setInt(5, getState());
            prepareStatement.setInt(6, getClassroomId());

            prepareStatement.executeUpdate();

            prepareStatement.close();

            this.connection.close();

        }

    }



}

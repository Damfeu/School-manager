package com.app.school_manager.interfaces;

import com.app.school_manager.models.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterface {
    List<Student> list() throws SQLException;
    void  create (Student student) throws SQLException;
}

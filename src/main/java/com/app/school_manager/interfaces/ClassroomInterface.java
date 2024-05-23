package com.app.school_manager.interfaces;

import com.app.school_manager.models.Classroom;

import java.sql.SQLException;
import java.util.List;

public interface ClassroomInterface{
    List<Classroom> list() throws SQLException;
}

package com.app.school_manager.interfaces;

import com.app.school_manager.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserInterface {
    List<User> list() throws SQLException;
}

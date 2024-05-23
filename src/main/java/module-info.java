module com.app.school_manager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.app.school_manager to javafx.fxml;
    exports com.app.school_manager;

    opens com.app.school_manager.controllers to javafx.fxml;
    exports com.app.school_manager.controllers;
}
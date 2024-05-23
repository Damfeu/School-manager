package com.app.school_manager.controllers;

import com.app.school_manager.models.Student;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.time.LocalDate;

public class AuthController {


    @FXML
    private TextField classroomTextField;

    @FXML
    private DatePicker dateOfBirthDatePicker;

    @FXML
    private TextField firstnameTextField;

    @FXML
    private TextField lastnameTextField;

    @FXML
    private TextField placeOfBirthTextField;

    @FXML
    private TextField stateTextField;

    @FXML
    private Button BouttonFermer;

    @FXML
    private Button BouttonSoumettre;

    @FXML
    void Fermer(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void SoumettreEdudiant(ActionEvent event) throws SQLException {
        if (firstnameTextField.getText().isEmpty() || lastnameTextField.getText().isEmpty() ||
                placeOfBirthTextField.getText().isEmpty() || dateOfBirthDatePicker.getValue() == null ||
                classroomTextField.getText().isEmpty() || stateTextField.getText().isEmpty()) {

            // registerStudent();
        } else {
            LocalDate dateOfBirth = dateOfBirthDatePicker.getValue();
            String firstName = firstnameTextField.getText().trim();
            String lastName = lastnameTextField.getText().trim();
            int state = Integer.parseInt(stateTextField.getText().trim());
            int classroom = Integer.parseInt(classroomTextField.getText().trim());
            String placeOfBirth = placeOfBirthTextField.getText().trim();

            Student student = new Student();

            student.setFirstname(firstName);
            student.setState(state);
            student.setClassroomId(classroom);
            student.setLastname(lastName);
            student.setPlaceOfBirth(placeOfBirth);
            student.setDateOfBirth(dateOfBirth);

            student.create(student);
        }

    }



}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class DashboardFormController {

    @FXML
    private AnchorPane anchAppoinmentForm;

    @FXML
    private AnchorPane anchDoctorForm;

    @FXML
    private AnchorPane anchPatientForm;

    @FXML
    private AnchorPane anchProfileForm;

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        anchAppoinmentForm.setVisible(false);
        anchDoctorForm.setVisible(false);
        anchPatientForm.setVisible(false);
        anchProfileForm.setVisible(false);
    }

    @FXML
    void btnAppoinmentOnAction(ActionEvent event) {
        anchAppoinmentForm.setVisible(true);
        anchDoctorForm.setVisible(false);
        anchPatientForm.setVisible(false);
        anchProfileForm.setVisible(false);

    }

    @FXML
    void btnDoctorOnAction(ActionEvent event) {
        anchDoctorForm.setVisible(true);
        anchAppoinmentForm.setVisible(false);
        anchPatientForm.setVisible(false);
        anchProfileForm.setVisible(false);
    }

    @FXML
    void btnPatientOnAction(ActionEvent event) {
        anchPatientForm.setVisible(true);
        anchAppoinmentForm.setVisible(false);
        anchDoctorForm.setVisible(false);
        anchProfileForm.setVisible(false);
    }

    @FXML
    void btnProfileOnAction(ActionEvent event) {
        anchProfileForm.setVisible(true);
        anchAppoinmentForm.setVisible(false);
        anchDoctorForm.setVisible(false);
        anchPatientForm.setVisible(false);
    }

}

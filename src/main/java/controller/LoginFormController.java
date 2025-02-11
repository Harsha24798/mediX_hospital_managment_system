package controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    @FXML
    private AnchorPane loginForm;

    @FXML
    private AnchorPane registerForm;

    @FXML
    private JFXCheckBox chkShowPassword;

    @FXML
    private JFXComboBox<String> cmbSelectUser;

    @FXML
    private Hyperlink hyperSignIn;

    @FXML
    private Hyperlink hyperSignUp;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXTextField txtUsername;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadcmb();
        loginForm.setVisible(true);  // Show login by default
        registerForm.setVisible(false);
    }

    private void loadcmb() {
        ObservableList<String> titleList = FXCollections.observableArrayList();
        titleList.add("Patient");
        titleList.add("Doctor");
        titleList.add("Staff");

        cmbSelectUser.setItems(titleList);
    }

    public void switchForm(javafx.event.ActionEvent event) {
        if (event.getSource() == hyperSignUp) {
            loginForm.setVisible(false);
            registerForm.setVisible(true);
        } else if (event.getSource() == hyperSignIn) {
            loginForm.setVisible(true);
            registerForm.setVisible(false);
        }
    }
}

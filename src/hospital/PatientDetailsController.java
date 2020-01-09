/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class PatientDetailsController implements Initializable {

    @FXML
    private TextField patient_id;
    @FXML
    private TextField first_name;
    @FXML
    private TextField last_name;
    @FXML
    private TextField problem;
    @FXML
    private TextField phone;
    @FXML
    private TextField assigned_doctor;
    @FXML
    private TextField permanent_address;
    @FXML
    private TextField present_address;
    @FXML
    private TextField age;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void insert(ActionEvent event) {
    }

    @FXML
    private void update(ActionEvent event) {
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
          FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Receptionist.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new PatientDetailsController.scene(root2));
           stage.setTitle("Hospital Management System");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide(); 
    }

    @FXML
    private void home(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Main_Menu.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new PatientDetailsController.scene(root2));
           stage.setTitle("Hospital Management System");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide(); 
    }
    private static class scene extends Scene {

        public scene(Parent root2) {
            super(root2);
        }
    }
}

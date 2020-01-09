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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class ReceptionistController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void save_patient_details(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("PatientDetails.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new ReceptionistController.scene(root2));
           stage.setTitle("Hospital Management System");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide(); 
    }

    @FXML
    private void payment_details(ActionEvent event) {
    }

    @FXML
    private void important_number(ActionEvent event) {
    }

    @FXML
    private void bill(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Main_Menu.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new ReceptionistController.scene(root2));
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

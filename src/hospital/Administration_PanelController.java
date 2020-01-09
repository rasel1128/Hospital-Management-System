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
public class Administration_PanelController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void doctor(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
         FXMLLoader(getClass().getResource("AddDoctor.fxml"));
           Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new Administration_PanelController.scene(root2));
          stage.setTitle("Hospital Management System Design By Md. Rasel");
          stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void nurse(ActionEvent event) throws IOException {
      FXMLLoader fxmlLoader = new
         FXMLLoader(getClass().getResource("AddNurse.fxml"));
           Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new Administration_PanelController.scene(root2));
          stage.setTitle("Hospital Management System Design By Md. Rasel");
          stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();   
    }
     private static class scene extends Scene {
         

        public scene(Parent root1) {
            super(root1);
        }
    }
}

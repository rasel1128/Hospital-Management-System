/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class Doctor_MainMenuController implements Initializable {

    @FXML
    private TextField patient_id;
    @FXML
    private TextField patient_name;
    @FXML
    private TextField health;
    @FXML
    private TextField prescribe;
    @FXML
    private TextField check;
    @FXML
    private Label msg;
    @FXML
    private TextField prescribe_test;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void home(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Main_Menu.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new Doctor_MainMenuController.scene(root2));
           stage.setTitle("Hospital Management System");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide(); 
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Main_Menu.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new Doctor_MainMenuController.scene(root2));
           stage.setTitle("Hospital Management System");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void delete(ActionEvent event) {
         try{
         Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospitalmanagement","root","");
         String sql="DELETE FROM doctor_mainmenu WHERE patient_ID='"+patient_id.getText()+"'";
         Statement Statement=conn.createStatement();
         Statement.executeUpdate(sql);
          msg.setText("Deleted");
        }
          catch (SQLException e) {
            msg.setText("Already Deleted or error Something");
        }
    }

    @FXML
    private void update(ActionEvent event) {
    }

    @FXML
    private void insert(ActionEvent event) {
         try{
         Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospitalmanagement","root","");
         String sql="INSERT INTO doctor_mainmenu VALUES ('"+patient_id.getText()+"', '"+patient_name.getText()+"', '"+health.getText()+"', '"+prescribe.getText()+"', '"+prescribe_test.getText()+"', '"+check.getText()+"')";
      Statement Statement=conn.createStatement();
         Statement.executeUpdate(sql);
          msg.setText("Inserted");
        }
          catch (SQLException e) {
            msg.setText("Already Inserted or error Something");
        }
    }
     private static class scene extends Scene {

        public scene(Parent root2) {
            super(root2);
        }
    }
}

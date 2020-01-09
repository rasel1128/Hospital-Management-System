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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class AddDoctorController implements Initializable {

    @FXML
    private TextField doctor_id;
    @FXML
    private TextField first_name;
    @FXML
    private TextField last_name;
    @FXML
    private TextField email;
    @FXML
    private TextField specialist;
    @FXML
    private TextField contact;
    @FXML
    private TextField qualification;
    @FXML
    private TextField present_address;
    @FXML
    private TextField age;
    @FXML
    private TextField gender;
    @FXML
    private TextField permanent_address;
    @FXML
    private Label msg;
    @FXML
    private TableView<doctor_details> doctor_details_table;
    @FXML
    private TableColumn<doctor_details, Integer> tdoctor_id;
    @FXML
    private TableColumn<doctor_details, String> tfirst_name;
    @FXML
    private TableColumn<doctor_details, String> tlast_name;
    @FXML
    private TableColumn<doctor_details, String> tspecialist;
    @FXML
    private TableColumn<doctor_details, String> temail;
    @FXML
    private TableColumn<doctor_details, String> tcontact;
    @FXML
    private TableColumn<doctor_details, String> tqualification;
    @FXML
    private TableColumn<doctor_details, String> tgender;
    @FXML
    private TableColumn<doctor_details, String> tage;
    @FXML
    private TableColumn<doctor_details, String> tpresent_address;
    @FXML
    private TableColumn<doctor_details, String> tpermanent_address;
    
    private Connection conn;
    private ObservableList<doctor_details> list;
    private DatabaseConnection dbHandler1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dbHandler1=new DatabaseConnection(); 
        try {
            populatetableview1();
        } catch (SQLException ex) {
            Logger.getLogger(AddDoctorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }  
    @SuppressWarnings("unchecked")
    private void populatetableview1() throws SQLException{
    
        list=FXCollections.observableArrayList();
        String sql="SELECT * FROM doctor_details";
        conn=dbHandler1.getConnection();
        ResultSet set=conn.createStatement().executeQuery(sql);
        while(set.next()){
        doctor_details doctor_details=new doctor_details();
        
        doctor_details.setDoctor_id(set.getInt("doctor_id"));
        doctor_details.setFirst_name(set.getString("first_name"));
        doctor_details.setLast_name(set.getString("last_name"));
        doctor_details.setSpecialist(set.getString("specialist"));
        doctor_details.setEmail(set.getString("email"));
        doctor_details.setContact(set.getString("contact"));
        doctor_details.setQualification(set.getString("qualification"));
        doctor_details.setGender(set.getString("gender"));
        doctor_details.setAge(set.getString("age"));
        doctor_details.setPresent_address(set.getString("present_address"));
        doctor_details.setPermanent_address(set.getString("permanent_address"));
         list.add(doctor_details);
        
        }
        tdoctor_id.setCellValueFactory(new PropertyValueFactory<>("doctor_id"));
         tfirst_name.setCellValueFactory(new PropertyValueFactory<>("first_name"));
         tlast_name.setCellValueFactory(new PropertyValueFactory<>("last_name"));
         tspecialist.setCellValueFactory(new PropertyValueFactory<>("specialist"));
         temail.setCellValueFactory(new PropertyValueFactory<>("email"));
         tcontact.setCellValueFactory(new PropertyValueFactory<>("contact"));
         tqualification.setCellValueFactory(new PropertyValueFactory<>("qualification"));
         tgender.setCellValueFactory(new PropertyValueFactory<>("gender"));
         tage.setCellValueFactory(new PropertyValueFactory<>("age"));
         tpresent_address.setCellValueFactory(new PropertyValueFactory<>("present_address"));
         tpermanent_address.setCellValueFactory(new PropertyValueFactory<>("permanent_address"));
         
         doctor_details_table.setItems(list);
    }    

    @FXML
    private void insert(ActionEvent event) {
         try{
         Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospitalmanagement","root","");
         String sql="INSERT INTO doctor_details VALUES ('"+doctor_id.getText()+"', '"+first_name.getText()+"', '"+last_name.getText()+"', '"+specialist.getText()+"', '"+email.getText()+"', '"+contact.getText()+"', '"+qualification.getText()+"', '"+gender.getText()+"', '"+age.getText()+"', '"+present_address.getText()+"', '"+permanent_address.getText()+"')";
      Statement Statement=conn.createStatement();
         Statement.executeUpdate(sql);
          msg.setText("Inserted");
        }
          catch (SQLException e) {
            msg.setText("Already Inserted or error Something");
        }
           
    }

    @FXML
    private void update(ActionEvent event) {
           try{
         Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospitalmanagement","root","");
         String sql="UPDATE doctor_details SET FIRST_NAME='"+first_name.getText()+"',LAST_NAME='"+last_name.getText()+"' WHERE _ID='"+doctor_id.getText()+"'";
      Statement Statement=conn.createStatement();
         Statement.executeUpdate(sql);
          msg.setText("Updated");
        }
          catch (SQLException e) {
            msg.setText("Already Update or error Something");
        }
    }

    @FXML
    private void delete(ActionEvent event) {
        
        try{
         Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospitalmanagement","root","");
         String sql="DELETE FROM doctor_details WHERE doctor_ID='"+doctor_id.getText()+"'";
         Statement Statement=conn.createStatement();
         Statement.executeUpdate(sql);
          msg.setText("Deleted");
        }
          catch (SQLException e) {
            msg.setText("Already Deleted or error Something");
        }
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
      FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Administration.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("Hospital Management System Doctor Details");
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
          stage.setScene(new scene(root2));
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Walton
 */
public class doctor_details {

    private final IntegerProperty doctor_id = new SimpleIntegerProperty();
    private final StringProperty first_name = new SimpleStringProperty();
    private final StringProperty last_name = new SimpleStringProperty();
    private final StringProperty specialist = new SimpleStringProperty();
    private final StringProperty email = new SimpleStringProperty();
    private final StringProperty contact = new SimpleStringProperty();
    private final StringProperty qualification = new SimpleStringProperty();
    private final StringProperty gender = new SimpleStringProperty();
    private final StringProperty age = new SimpleStringProperty();
    private final StringProperty present_address = new SimpleStringProperty();
    private final StringProperty permanent_address = new SimpleStringProperty();

    public String getPermanent_address() {
        return permanent_address.get();
    }

    public void setPermanent_address(String value) {
        permanent_address.set(value);
    }

    public StringProperty permanent_addressProperty() {
        return permanent_address;
    }

    public String getPresent_address() {
        return present_address.get();
    }

    public void setPresent_address(String value) {
        present_address.set(value);
    }

    public StringProperty present_addressProperty() {
        return present_address;
    }

    public String getAge() {
        return age.get();
    }

    public void setAge(String value) {
        age.set(value);
    }

    public StringProperty ageProperty() {
        return age;
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(String value) {
        gender.set(value);
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public String getQualification() {
        return qualification.get();
    }

    public void setQualification(String value) {
        qualification.set(value);
    }

    public StringProperty qualificationProperty() {
        return qualification;
    }

    public String getContact() {
        return contact.get();
    }

    public void setContact(String value) {
        contact.set(value);
    }

    public StringProperty contactProperty() {
        return contact;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String value) {
        email.set(value);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public String getSpecialist() {
        return specialist.get();
    }

    public void setSpecialist(String value) {
        specialist.set(value);
    }

    public StringProperty specialistProperty() {
        return specialist;
    }

    public String getLast_name() {
        return last_name.get();
    }

    public void setLast_name(String value) {
        last_name.set(value);
    }

    public StringProperty last_nameProperty() {
        return last_name;
    }
    

    public String getFirst_name() {
        return first_name.get();
    }

    public void setFirst_name(String value) {
        first_name.set(value);
    }

    public StringProperty first_nameProperty() {
        return first_name;
    }
    

    public int getDoctor_id() {
        return doctor_id.get();
    }

    public void setDoctor_id(int value) {
        doctor_id.set(value);
    }

    public IntegerProperty doctor_idProperty() {
        return doctor_id;
    }
   
    
}

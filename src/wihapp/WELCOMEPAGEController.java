/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package wihapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author khalf
 */
public class WELCOMEPAGEController implements Initializable {
    @FXML
    private Label LABELBIENVENUE ;
    @FXML
    private Button buttonhome;
    @FXML
    private Button buttonExit;
    @FXML
    private RadioButton RFarancais;
    @FXML
    private RadioButton RAnglais;
    @FXML
    private RadioButton RAabe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gOTOhOME(ActionEvent event) {
    }

    @FXML
    private void Exit(ActionEvent event) {Platform.exit();
    }

    @FXML
    private void ChangeToFrench(ActionEvent event) {
        
    }

    @FXML
    private void ChangeToEnglish(ActionEvent event) {
        LABELBIENVENUE.setText("Welcome to WOMEN IN HEALTH");
    }

    @FXML
    private void hangeToArabic(ActionEvent event) {
    }
    
}

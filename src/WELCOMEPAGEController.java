/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author khalf
 */
public class WELCOMEPAGEController implements Initializable {
  
    @FXML
    RadioButton RAabe;

    @FXML
    RadioButton RAnglais;

    @FXML
     RadioButton RFarancais;

    @FXML
    Button buttonExit;
    
    @FXML 
    Label labelBienvenue;

    @FXML
     Button buttonhome;
    @FXML 
    Label TEXT1;
    @FXML 
    Label Text2;
    
   
    @FXML
    public  void Exit(){Platform.exit();}
    
    
    public void gOTOhOME(ActionEvent event) throws IOException{
        buttonhome.getScene().getWindow().hide();
        Parent HOME = FXMLLoader.load(getClass().getResource("HOME.fxml"));
        
        Scene sceneHOME = new Scene(HOME);
        Stage stageHome=new Stage();
        stageHome.setTitle("WIH HOME");
        stageHome.setScene(sceneHOME);
        stageHome.show();
        
        /*public void confirmerQuestion(ActionEvent event ) throws IOException {
        //question.setText("avez vous de fièvre ?");
        /*yesbtn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("fievre.fxml"));
        
         Scene scene = new Scene(root);
            Stage stage =new Stage();
             stage.setScene(scene);
             //stage.setTitle("S");
             stage.show();      */
    }
    public void ChangeToArabic(){
        labelBienvenue.setText("مرحبا بكم في تطبيق المرأة في مجال الصحة");
        buttonhome.setText("ابدأ مغامرتك!");
        TEXT1.setText(" هو تطبيق لزيادة الوعي للنساء لتمكينهن منWIH");
        Text2.setText("التواصل، تبادل الخبرات،...");
        buttonExit.setText("خروج");
        RFarancais.setText(" الفرنسية");
        RAnglais.setText("الانجليزية ");
        RAabe.setText("العربية");}
    public void ChangeToEnglish(){
        labelBienvenue.setText("Welcome TO Women IN HEALTH");
        buttonhome.setText("Let's start your adventure!");
        TEXT1.setText("WIH is an awareness-raising app for women to enable them to");
        Text2.setText("Communicate, share experiences, ...");
        buttonExit.setText("Exit");
        RFarancais.setText("French");
        RAnglais.setText("English");
        RAabe.setText("Arabic");
    }
    public void ChangeToFrench(){
        labelBienvenue.setText("Bienvenue à Women IN HEALTH");
        buttonhome.setText(" ");
        TEXT1.setText("WIH est une application de sensibilisation  pour femmes pour leur permettre de");
        Text2.setText("Communiquer, partager leurs expériences, ...");
        buttonExit.setText("Quittez");
        RFarancais.setText("Frrancais");
        RAnglais.setText("Anglais");
        RAabe.setText("Arabe");
    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

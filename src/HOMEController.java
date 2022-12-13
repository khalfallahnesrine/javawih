

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HOMEController {

    @FXML
     Button ButtonPP;

    @FXML
    Button Buttonconnexion;

    @FXML
     Label LabelHome;

    @FXML
    ImageView PHOTOLOGO;

    @FXML
    ImageView PHOTOLOGO1;

    @FXML
    RadioButton RAnglais;

    @FXML
    RadioButton RArabe;

    @FXML
    RadioButton Rfrancais;

    @FXML
    Button buttoninscrit;

   /* @FXML
    void ChangeToArabic(ActionEvent event) {

    }

    @FXML
    void ChangeToEnglish(ActionEvent event) {

    }

    @FXML
    void ChangeToFrench(ActionEvent event) {

    }*/

    @FXML
    public void gotoconnexioninterface(ActionEvent event)  { 
        try {
            Buttonconnexion.getScene().getWindow().hide();
            Parent Connexion = FXMLLoader.load(getClass().getResource("CONNEXIONINTERFACE.fxml"));
            
            Scene sceneConnexion = new Scene(Connexion);
            Stage stageHome=new Stage();
            stageHome.setTitle("WIH Connexion Interface");
            stageHome.setScene(sceneConnexion);
            stageHome.show();
        } catch (IOException ex) {
            Logger.getLogger(HOMEController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoincriptioninterface(ActionEvent event) throws IOException {
             buttoninscrit.getScene().getWindow().hide();
             Parent Inscription = FXMLLoader.load(getClass().getResource("InscriptionINTERFACE.fxml"));
            
            Scene sceneInscription = new Scene(Inscription);
            Stage stageHome=new Stage();
            stageHome.setTitle("WIH Inscription Interface");
            stageHome.setScene(sceneInscription);
            stageHome.show();
    }

    @FXML
    void gotopageprecedente(ActionEvent event) throws IOException {
            ButtonPP.getScene().getWindow().hide();
            Parent PP = FXMLLoader.load(getClass().getResource("WELCOMEPAGE.fxml"));
            
            Scene scenePP = new Scene(PP);
            Stage stagePP =new Stage();
            stagePP.setTitle("WIH");
            stagePP.setScene(scenePP);
            stagePP.show();

    }

}

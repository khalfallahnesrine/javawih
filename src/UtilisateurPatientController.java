import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class UtilisateurPatientController {

    @FXML
    private Button BPP;

    @FXML
    private MenuButton BsituationFamillaile;
    @FXML
    private Button  SUBMIT;
    
    public void GoToPP(ActionEvent event) throws IOException {
        BPP.getScene().getWindow().hide();
        Parent PP = FXMLLoader.load(getClass().getResource("INSCRIPTIONINTERFACE.fxml"));
        
        Scene scenePP = new Scene(PP);
        Stage stagePP=new Stage();
        stagePP.setTitle("WIH Inscription Interface ");
        stagePP.setScene(scenePP);
        stagePP.show();}
    public void Submit (ActionEvent event) throws IOException {
        SUBMIT.getScene().getWindow().hide();
        Parent IP = FXMLLoader.load(getClass().getResource("InscriptionReussite.fxml"));
        
        Scene sceneIP = new Scene(IP);
        Stage stageIP=new Stage();
        stageIP.setTitle("WIH Inscription Réussite ");
        stageIP.setScene(sceneIP);
        stageIP.show();}

}

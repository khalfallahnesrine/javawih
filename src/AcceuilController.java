import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AcceuilController {

    @FXML
    private Button bcontactus;

    @FXML
    private Button bmessage;

    @FXML
    private Button brecherche;
     @FXML
    private Button bnotes ;
     @FXML
    private Button bpp ;

    @FXML
    public void SendMessage(ActionEvent event) throws IOException {
        bmessage.getScene().getWindow().hide();
        Parent message = FXMLLoader.load(getClass().getResource("Message.fxml"));
        
        Scene scenemessage = new Scene(message);
        Stage stagemessage=new Stage();
        stagemessage.setTitle("Vos messages ");
        stagemessage.setScene(scenemessage);
        stagemessage.show();}
    public void recherche(ActionEvent event) throws IOException {
        brecherche.getScene().getWindow().hide();
        Parent recherche = FXMLLoader.load(getClass().getResource("recherche.fxml"));
        
        Scene scenerecherche = new Scene(recherche);
        Stage stagerecherche=new Stage();
        stagerecherche.setTitle("Rechercher un Rendez vous");
        stagerecherche.setScene(scenerecherche);
        stagerecherche.show();}
       public void Notes(ActionEvent event) throws IOException {
        bnotes.getScene().getWindow().hide();
        Parent Notes = FXMLLoader.load(getClass().getResource("Notes.fxml"));
        
        Scene sceneNotes = new Scene(Notes);
        Stage stageNotes=new Stage();
        stageNotes.setTitle("Vos Notes");
        stageNotes.setScene(sceneNotes);
        stageNotes.show();}
       public void GoToPP(ActionEvent event) throws IOException {
        bpp.getScene().getWindow().hide();
        Parent PP = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
        Scene scenePP = new Scene(PP);
        Stage stagePP=new Stage();
        stagePP.setTitle("WIH HOME ");
        stagePP.setScene(scenePP);
        stagePP.show();}
    }

   



  
 
  

    
   
    



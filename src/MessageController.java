import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MessageController {

    @FXML
    private Button Bpp;
      @FXML
    public void GoToPP(ActionEvent event) throws IOException {
        Bpp.getScene().getWindow().hide();
        Parent PP = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        
        Scene scenePP = new Scene(PP);
        Stage stagePP=new Stage();
        stagePP.setTitle("Votre Acceuil ");
        stagePP.setScene(scenePP);
        stagePP.show();}

}

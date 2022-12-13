import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RechercheController {

    @FXML
    private Button bpp;
    public void GoToPP(ActionEvent event) throws IOException {
        bpp.getScene().getWindow().hide();
        Parent PP = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        
        Scene scenePP = new Scene(PP);
        Stage stagePP=new Stage();
        stagePP.setTitle("Votre Acceuil ");
        stagePP.setScene(scenePP);
        stagePP.show();}

}

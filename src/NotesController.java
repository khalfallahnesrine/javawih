import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NotesController {

    @FXML
    private Button bajouter;

    @FXML
    private TextField idnotes;

    @FXML
    private TextArea tnotes;
    @FXML
    PasswordField CIN ;
    
    public void enregistrernotes(ActionEvent event){   
        
           try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                 try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/womeninhealth?useSSl=false","root","")) {
                     
                     Statement  st =  conn.createStatement() ;
                     String cin = CIN.getText() ;
                      String numnote = idnotes.getText() ;
                        String  notes  = tnotes.getText() ;
                      
                        
              PreparedStatement preparedStatement = null;   
              String sql =    "INSERT INTO note values(?,?,?) ";
             preparedStatement = conn.prepareStatement(sql); //Making use of prepared statements here to insert bunch of data
             preparedStatement.setString(1 , cin );
             preparedStatement.setString(2 , numnote);
             preparedStatement.setString(3,notes);
            
             int i= preparedStatement.executeUpdate();
              if (i!=0)  //Just to ensure data has been inserted into the database
                
                       bajouter.getScene().getWindow().hide();
                         
                         Parent connexion = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
                         
                         Scene sceneconnexion = new Scene(connexion);
                         Stage stageconnexion=new Stage();
                         stageconnexion.setTitle("Acceuil");
                         stageconnexion.setScene(sceneconnexion);
                         stageconnexion.show();
                    }} 
           catch(IOException | ClassNotFoundException | SQLException exceptionlogin){
                 System.out.println(exceptionlogin.getMessage());
            }
       }
      
 
      }

                            

    
    
    



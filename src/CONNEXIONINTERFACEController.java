import java.sql.*;


import java.io.IOException;
import java.sql.DriverManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CONNEXIONINTERFACEController {

    @FXML
   CheckBox CHECKMDP;

    @FXML
    Hyperlink Linkmdp;

    @FXML
     PasswordField Passwordfield;
     
    @FXML
    TextField nomutilisateur ;
    
     @FXML
    TextField textpassword;
    @FXML
     Button bpp;

    @FXML
    Button bps;
    
    @FXML
     Button breset ;
    
    @FXML
     Button bseconnecter ;

    @FXML
     Label labelconnexion;

    @FXML
    public void GoToPP(ActionEvent event) throws IOException {
        bpp.getScene().getWindow().hide();
        Parent bPP = FXMLLoader.load(getClass().getResource("HOME.fxml"));
        
        Scene scenebpp = new Scene(bPP);
        Stage stagebpp=new Stage();
        stagebpp.setTitle("WIH HOME");
        stagebpp.setScene(scenebpp);
        stagebpp.show();}
            
    public void GoToPs(ActionEvent event) throws IOException {
        bps.getScene().getWindow().hide();
        Parent bPP = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        
        Scene scenebpp = new Scene(bPP);
        Stage stagebpp=new Stage();
        stagebpp.setTitle("Acceuil");
        stagebpp.setScene(scenebpp);
        stagebpp.show();}
    
    public void reset (ActionEvent event){
        Passwordfield.setText("");
        nomutilisateur.setText(" ");
        textpassword.setText("");
        
        }
        
    public void login (ActionEvent event){
             try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                 try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/womeninhealth?useSSl=false","root","")) {
                     String username =nomutilisateur.getText();
                     String Password =Passwordfield.getText() ;
                     
                     Statement  st =  conn.createStatement() ;
                     
                     String sql ="select * from utilisateurpatient where email ='"+username+ "'and motdepass ='"+Password+"'";
                     ResultSet RS =st.executeQuery(sql);
                     if (RS.next()){
                         
                         bseconnecter.getScene().getWindow().hide();
                         
                         Parent connexion = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
                         
                         Scene sceneconnexion = new Scene(connexion);
                         Stage stageconnexion=new Stage();
                         stageconnexion.setTitle("Acceuil");
                         stageconnexion.setScene(sceneconnexion);
                         stageconnexion.show();
                     }
                     else {
                         Passwordfield.setText("");
                         nomutilisateur.setText(" ");
                         System.out.println("invalide") ;
                     }
                 }
             }
             
            catch(IOException | ClassNotFoundException | SQLException exceptionlogin){
                 System.out.println(exceptionlogin.getMessage());
            }
       }
      
 
     public void oncheckpassword(ActionEvent evt)
       {
           if(CHECKMDP.isSelected())
           {
              textpassword.setText(Passwordfield.getText());
              Passwordfield.managedProperty().bind(CHECKMDP.selectedProperty().not());
              Passwordfield.visibleProperty().bind(CHECKMDP.selectedProperty().not());
        }
           }
       }

        /* public void GoToPS(ActionEvent event) throws IOException {
        bps.getScene().getWindow().hide();
        Parent bPS = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        
        Scene scenebps = new Scene(bPS);
        Stage stagebps=new Stage();
        stagebps.setTitle("Votre Acceuil");
        stagebps.setScene(scenebps);
        stagebps.show();}
*/
   


    
    
        
    

  
    /*public void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
      if(CHECKMDP.isSelected())
        {
             Passwordfield.managedProperty().bind(CHECKMDP.selectedProperty().not());
              Passwordfield.visibleProperty().bind(CHECKMDP.s
             electedProperty().not());
        }
        
          
        
    }*/


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author khalf
 */
public class INSCRIPTIONINTERFACEController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button Butonpp;

    @FXML
    private Button confirmer;

    @FXML
    private PasswordField mdp;

    @FXML
    private TextField tcin;

    @FXML
    private TextField tmail;

    @FXML
    private TextField tnom;

    @FXML
    private TextField tnumtel;

    @FXML
    private TextField tprenom;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    public void GoToPP() throws IOException{
        Butonpp.getScene().getWindow().hide();
        Parent bPP = FXMLLoader.load(getClass().getResource("HOME.fxml"));
        
        Scene scenebpp = new Scene(bPP);
        Stage stagebpp=new Stage();
        stagebpp.setTitle("WIH HOME");
        stagebpp.setScene(scenebpp);
        stagebpp.show();}
    public void signin () throws ClassNotFoundException, SQLException{
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                 try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/womeninhealth?useSSl=false","root","")) {
                     
                     Statement  st =  conn.createStatement() ;
                      String cin =  tcin.getText() ;
                        String  prenom  = tprenom.getText() ;
                      String nom =  tnom.getText() ;
                         String  email = tmail.getText() ;
                       String tel = tnumtel.getText() ;
                        String    motdepass  = mdp.getText() ;
                        
                            PreparedStatement preparedStatement = null;  
                            

                    String sql =    "INSERT INTO utilisateurpatient values(?,?,?,?,?,?) ";
             preparedStatement = conn.prepareStatement(sql); //Making use of prepared statements here to insert bunch of data
             preparedStatement.setString(1,cin);
             preparedStatement.setString(2, nom);
             preparedStatement.setString(3, prenom);
             preparedStatement.setString(4, email);
             
             preparedStatement.setString(5, tel);
             preparedStatement.setString(6, motdepass);
     
             int i= preparedStatement.executeUpdate();
              if (i!=0)  //Just to ensure data has been inserted into the database
                
                        confirmer.getScene().getWindow().hide();
                         
                         Parent connexion = FXMLLoader.load(getClass().getResource("InscriptionReussite.fxml"));
                         
                         Scene sceneconnexion = new Scene(connexion);
                         Stage stageconnexion=new Stage();
                         stageconnexion.setTitle("Welcome");
                         stageconnexion.setScene(sceneconnexion);
                         stageconnexion.show();
                    }} catch(IOException | ClassNotFoundException | SQLException exceptionlogin){
                 System.out.println(exceptionlogin.getMessage());
            }
       }
      
 
      }

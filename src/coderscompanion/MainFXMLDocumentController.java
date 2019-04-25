/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderscompanion;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author user
 */
public class MainFXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private JFXTextArea configurationTextArea;
    
    private String cpuInfo;
    @FXML
    private AnchorPane rootPane;
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cpuInfo = "User Name: " + PropertyClass.userName + "\n\n";
        cpuInfo += "Operating System: " + PropertyClass.osName + "\n\n";
        cpuInfo += "Ram: " + PropertyClass.memorySize + " GB\n\n";
        cpuInfo += "Hard Disk: " + PropertyClass.diskSize + "GB";
        configurationTextArea.setText(cpuInfo);
    }    

    @FXML
    private void goToChoiceMenu(ActionEvent event) throws Exception {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/choicemenu/ChoiceMenu.fxml"));
        rootPane.getChildren().setAll(pane);
    }



    
    
}

package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MachineSelecctionWindowController implements Initializable{

	@FXML
    private Button mealeyMachine_btn;

    @FXML
    private Button mooreMachine_btn;

    @FXML
    void mealeyClicked(ActionEvent event) {
       
    	
    	nextWindow("Mealey", event);
    }

    @FXML
    void mooreClicked(ActionEvent event) {

    	
    	nextWindow("Moore", event);
    }

	private void nextWindow(String type, ActionEvent event) {
		
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/EntriesStatesWindow.fxml"));
			Parent root = (Parent)fxmlLoader.load();
			EntriesStatesWindowController controller = fxmlLoader.<EntriesStatesWindowController>getController();
			controller.setWorld(type);
			Scene scene = new Scene(root);
			Stage stage = (Stage) mealeyMachine_btn.getScene().getWindow();
			stage.setScene(scene);
			stage.show();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}

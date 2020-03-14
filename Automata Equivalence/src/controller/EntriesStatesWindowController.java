package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;

public class EntriesStatesWindowController implements Initializable{

	 @FXML
	    private Button accept_btn;

	    @FXML
	    private Spinner<Integer> numberEntries_Spinner;

	    @FXML
	    private Spinner<Integer> numberStatesM1_Spinner;

	    @FXML
	    private Spinner<Integer> numberStatesM2_Spinner;

	    @FXML
	    void acceptClicked(ActionEvent event) {

	    	nextWindow();
	    	
	    }
	    
	    private void nextWindow() {
	    	
	    	try {
				FXMLLoader fxmlLoader = FXMLLoader.load(getClass().getResource("/application/TablesCalculateWindow.fxml"));
				Parent root = (Parent) fxmlLoader.load();
				TablesCalculateWindowController controller = fxmlLoader.<TablesCalculateWindowController>getController();
				controller.setWorld("last window connected");
				Scene scene = new Scene(root);
				Stage stage = (Stage)accept_btn.getScene().getWindow(); 
				stage.setScene(scene);
				stage.show();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
	    }
	    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	public void setWorld(String type) {

         System.out.print("data is passing from las window, machine = "+type);
		
	}

}

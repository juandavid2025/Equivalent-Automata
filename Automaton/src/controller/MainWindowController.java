package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * controller of the MainWindow.
 * @author Juan David Aguirre
 * Version 1.0.0 - 12/03/2020
 */
public class MainWindowController implements Initializable{

	public static ObservableList<String> AUTOMATON_TYPES = FXCollections.observableArrayList("Moore","Mealy");
	
	@FXML
    private Tab dataRegistration_Tab;

    @FXML
    private ImageView loadImage_ImageView;

    @FXML
    private ImageView saveImage_ImageView;

    @FXML
    private ChoiceBox<String> typeAutomaton1_ChoiceBox;

    @FXML
    private ChoiceBox<String> typeAutomaton2_ChoiceBox;

    @FXML
    private TextField numberOfStatesA1_TextField;

    @FXML
    private TextField numberOfStatesA2_TextField;

    @FXML
    private TextField numberOfEntriesA1_TextField;

    @FXML
    private TextField numberOfEntriesA2_TextField;

    @FXML
    private Button fillMatrizA1_Button;

    @FXML
    private Button fillMatrizA2_Button;

    @FXML
    private Label result_Label;

    @FXML
    private Tab results_Tab;
    
    @FXML
    void loadClicked(MouseEvent event) {
    	System.out.print("\n load clicked \n");
    }

    @FXML
    void saveClicked(MouseEvent event) {
    	System.out.print("\n save clicked \n");
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		typeAutomaton1_ChoiceBox.setValue("Mealy");
		typeAutomaton2_ChoiceBox.setValue("Mealy");
		
		typeAutomaton1_ChoiceBox.setItems(AUTOMATON_TYPES);
		typeAutomaton2_ChoiceBox.setItems(AUTOMATON_TYPES);
		
	}

}

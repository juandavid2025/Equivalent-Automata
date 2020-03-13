package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Main class, where all begins.
 * @author Juan David Aguirre
 * Version 1.0.0 - 12/03/2020
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryWindow) throws IOException {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/MainWindow.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryWindow.setScene(scene);
			primaryWindow.setTitle("Automaton Equivalence");
			primaryWindow.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

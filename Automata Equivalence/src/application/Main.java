package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryWindow) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/MachineSelecctionWindow.fxml"));
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

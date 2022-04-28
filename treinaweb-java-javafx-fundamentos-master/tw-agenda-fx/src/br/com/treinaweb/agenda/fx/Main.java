package br.com.treinaweb.agenda.fx;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
		
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource(Messages.getString("Main.0"))); //$NON-NLS-1$
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource(Messages.getString("Main.1")).toExternalForm()); //$NON-NLS-1$
			primaryStage.setScene(scene);
			primaryStage.setTitle(Messages.getString("Main.2")); //$NON-NLS-1$
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			root = (AnchorPane)FXMLLoader.load(getClass().getResource("FXMLLotto.fxml"));
			Scene scene = new Scene(root,400,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Lotto ����");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

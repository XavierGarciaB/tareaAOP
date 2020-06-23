package main;

import Components.BlackButton;
import Components.BlueButton;
import Components.RedButton;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainMenu {
	private VBox root;
	private Scene scene;
	
	public MainMenu() {
		root = new VBox();
        scene = new Scene(root, 600, 500);
        createRoot();
        createButtonPanel();
	}
	
	private void createRoot() {
		root.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
	    root.setAlignment(Pos.CENTER);
	    root.setSpacing(20);    
	}
	
	private void createButtonPanel() {
		Button negro = new BlackButton(scene).createButton();
	    Button rojo = new BlueButton(scene).createButton();
	    Button azul = new RedButton(scene).createButton();
	    root.getChildren().addAll(negro, rojo, azul);
	}
	
	public VBox getRoot() {
		return root;
	}

	public void setRoot(VBox root) {
		this.root = root;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
	
    
}

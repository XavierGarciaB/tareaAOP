package main;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

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
		Button negro = createButton("Negro");
	    Button rojo = createButton("Rojo");
	    Button azul = createButton("Azul");
	    root.getChildren().addAll(negro, rojo, azul);
	}
	
	private Button createButton(String color) {
		Button btn = new Button(color);
		btn.setText(color);
		btn.setMinWidth(100);
		btn.setOnAction(e -> {
			setColor(color.toLowerCase());
		});
		return btn;
	}
	
	public void setColor(String color) {
		switch(color) {
			case "negro":
				scene.setFill(Color.BLACK);
				break;
			case "azul":
				scene.setFill(Color.BLUE);
				break;
			case "rojo":
				scene.setFill(Color.RED);
				break;
		}
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

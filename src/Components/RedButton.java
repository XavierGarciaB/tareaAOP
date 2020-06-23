package Components;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import main.ColoredButton;

public class RedButton extends Button implements ColoredButton {
	private String color;
	private Scene scene;

	public RedButton(Scene scene) {
		color = "Rojo";
		this.scene = scene;
	}
	
	@Override
	public Button createButton() {
		this.setText(color);
		this.setMinWidth(100);
		this.setOnAction(e -> {
			setRed();
		});
		return this;
	}
	
	public void setRed() {
		scene.setFill(Color.RED);
	}
}

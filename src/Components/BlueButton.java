package Components;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import main.ColoredButton;

public class BlueButton extends Button implements ColoredButton {
	private String color;
	private Scene scene;

	public BlueButton(Scene scene) {
		color = "Azul";
		this.scene = scene;
	}
	
	@Override
	public Button createButton() {
		this.setText(color);
		this.setMinWidth(100);
		this.setOnAction(e -> {
			setBlue();
		});
		return this;
	}
	
	public void setBlue(){
		scene.setFill(Color.BLUE);
	}
}

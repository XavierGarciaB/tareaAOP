package Components;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import main.ColoredButton;

public class BlackButton extends Button implements ColoredButton {
	private String color;
	private Scene scene;

	public BlackButton(Scene scene) {
		color = "Negro";
		this.scene = scene;
	}
	
	@Override
	public Button createButton() {
		this.setText(color);
		this.setMinWidth(100);
		this.setOnAction(e -> {
			setBlack();
		});
		return this;
	}
	
	public void setBlack() {
		scene.setFill(Color.BLACK);
	}
}

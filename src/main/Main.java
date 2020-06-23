package main;

import javafx.application.Application;
import javafx.stage.Stage;
 
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tarea AOP");
        MainMenu main = new MainMenu();
        primaryStage.setScene(main.getScene());
        primaryStage.show();
    }
}

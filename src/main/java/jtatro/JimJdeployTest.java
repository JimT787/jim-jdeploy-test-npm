package jtatro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class JimJdeployTest extends Application {
    

    @Override
    public void start(Stage stage) throws Exception {
        var label = new Label("Hello, JavaFX " );
        Scene scene = new Scene(new StackPane(label), 640, 480);
        stage.setTitle("Jdeploy Test");
        stage.setScene(scene);
        stage.setMinWidth(scene.getWidth());
        stage.setMinHeight(scene.getHeight() + 40);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

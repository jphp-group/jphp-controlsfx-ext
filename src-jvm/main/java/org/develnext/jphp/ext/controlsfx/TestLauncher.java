package org.develnext.jphp.ext.controlsfx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.controlsfx.control.*;

public class TestLauncher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();

        PrefixSelectionChoiceBox<String> box  = new PrefixSelectionChoiceBox<>();
        box.getItems().addAll("aue", "kek", "lul");

        root.getChildren().add(box);

        stage.setScene(new Scene(root, 640, 480));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

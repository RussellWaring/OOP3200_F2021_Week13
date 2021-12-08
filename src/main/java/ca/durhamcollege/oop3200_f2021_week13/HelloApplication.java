/*
2021-12-06
week 13 p 1

 */
package ca.durhamcollege.oop3200_f2021_week13;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        // Step 1 - Instantiate controls
        Label helloLabel = new Label("Hello, World!");
        Label goodbyeLabel = new Label("Good Bye!");
        Label helloLabel2 = new Label("Good Bye!");
        Label goodbyeLabel2 = new Label("Good Bye!");

        // Step 2 - instantiate containers
        HBox hbox = new HBox(); // like a Horizontal Stack (side by side) - Column Data

        hbox.getChildren().add(helloLabel);
        hbox.getChildren().add(goodbyeLabel);

        HBox hbox2 = new HBox();

        hbox2.getChildren().add(helloLabel2);
        hbox2.getChildren().add(goodbyeLabel2);

        VBox vbox = new VBox(hbox, hbox2); // like a Vertical Stack (vertical list) - Row Data

        // Step 3 - setup and configure the Scene
        Scene scene = new Scene(vbox, 640, 480);

        // Step 4 - Setup the stage (Windoe / Screen)
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}
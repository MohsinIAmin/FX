/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mohsin
 */
public class Login extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        VBox parent = new VBox();
        root.getChildren().add(btn);
        HorijantalBox hbox1 = new HorijantalBox("Name : ","","");
        HorijantalBox hbox2 = new HorijantalBox("Email : ","","");
        HorijantalBox hbox3 = new HorijantalBox(3,"Email : ","","");
        parent.getChildren().add(hbox1.getHBox());
        parent.getChildren().add(hbox2.getHBox());
        parent.getChildren().add(hbox3.getHBox2());
        parent.setSpacing(30);
        Scene scene;
        scene = new Scene(parent, 500, 500);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

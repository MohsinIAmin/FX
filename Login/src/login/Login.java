package login;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox parent = new VBox();
        HorijantalBox hbox1 = new HorijantalBox("Name : ","","");
        HorijantalBox hbox2 = new HorijantalBox("Email : ","","");
        HorijantalBox hbox3 = new HorijantalBox(60,"OK","Cancel","Clear");
        String[] choice = new String[]{"Select One","BSSE12","BSSE11","BSSE10","BSSE09"};
        HorijantalBox hbox4 = new HorijantalBox(choice);
        HorijantalBox hbox5 = new HorijantalBox("About yourself : ");
        String[] options = new String[]{" Male","Female"};
        HorijantalBox hbox6 = new HorijantalBox("Gender : ",options);
        parent.getChildren().add(hbox1.getHBox1());
        parent.getChildren().add(hbox2.getHBox1());
        parent.getChildren().add(hbox6.getHBox1());
        parent.getChildren().add(hbox4.getHBox1());
        parent.getChildren().add(hbox5.getHBox1());
        parent.getChildren().add(hbox3.getHBox1());
        parent.setSpacing(2);
        parent.setAlignment(Pos.CENTER);
        Scene scene;
        scene = new Scene(parent, 700, 600);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

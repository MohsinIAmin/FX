package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application {

    HorijantalBox[] hbox = new HorijantalBox[10];
    VBox parent = new VBox();
    String[] choice = new String[]{"Select One", "BSSE12", "BSSE11", "BSSE10", "BSSE09"};
    String[] options = new String[]{" Male", "Female"};
    String[] information = new String[5];
    Boolean ok = true;

    @Override
    public void start(Stage primaryStage) {

        this.hbox[0] = new HorijantalBox("Name : ", "", "");
        this.hbox[1] = new HorijantalBox("Email : ", "", "");
        this.hbox[2] = new HorijantalBox("Gender : ", options);
        this.hbox[3] = new HorijantalBox(choice);
        this.hbox[4] = new HorijantalBox("About yourself : ");
        this.hbox[5] = new HorijantalBox(60, "OK", "Cancel", "Clear");

        this.parent.getChildren().add(this.hbox[0].getHBox1());
        this.parent.getChildren().add(this.hbox[1].getHBox1());
        this.parent.getChildren().add(this.hbox[2].getHBox1());
        this.parent.getChildren().add(this.hbox[3].getHBox1());
        this.parent.getChildren().add(this.hbox[4].getHBox1());
        this.parent.getChildren().add(this.hbox[5].getHBox1());
        this.parent.setSpacing(2);
        this.parent.setAlignment(Pos.CENTER);
        Scene scene;
        scene = new Scene(parent, 700, 600);

        this.hbox[5].btn1.setOnAction(e -> okBtnAction(e));
        this.hbox[5].btn2.setOnAction(e -> cancelBtnAction(e));
        this.hbox[5].btn3.setOnAction(e -> clearBtnAction(e));
        this.hbox[2].checkBox[0].setOnAction(e -> checkAction(e));
        this.hbox[2].checkBox[1].setOnAction(e -> checkAction(e));

        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void okBtnAction(ActionEvent e) {
        this.information[0] = this.hbox[0].text.getText();
        if ("".equals(this.information[0])) {
            this.hbox[0].label2.setText("Name is Required");
            this.ok = false;
        }
        this.information[1] = this.hbox[1].text.getText();
        if ("".equals(this.information[1])) {
            this.hbox[1].label2.setText("Email is Required");
            this.ok = false;
        }
        if (this.hbox[2].checkBox[0].isSelected() || this.hbox[2].checkBox[1].isSelected()) {
            if (this.hbox[2].checkBox[0].isSelected()) {
                this.information[2] = "Male";
            } else {
                this.information[2] = "Female";
            }
        } else {
            this.hbox[2].label2.setText("Gender Required");
            this.ok = false;
        }
        if (this.hbox[3].choiceBox.getValue().equals("Select One")) {
            this.hbox[3].label2.setText("Batch Required");
            this.ok = false;
        } else {
            this.information[3] = (String) this.hbox[3].choiceBox.getValue();
        }
        this.information[4] = this.hbox[4].textArea.getText();
        if (ok) {
            this.clearBtnAction(e);
        } else {
            System.out.println(this.information[0]
                    +this.information[1]
                    +this.information[2]
                    +this.information[3]
                    +this.information[4]);
        }
    }

    private void cancelBtnAction(ActionEvent e) {
        System.exit(0);
    }

    private void clearBtnAction(ActionEvent e) {
        this.hbox[0].text.setText("");
        this.hbox[0].label2.setText("");
        this.hbox[1].text.setText("");
        this.hbox[1].label2.setText("");
        this.hbox[2].checkBox[0].setSelected(false);
        this.hbox[2].checkBox[1].setSelected(false);
        this.hbox[2].label2.setText("");
        this.hbox[3].choiceBox.setValue(this.choice[0]);
        this.hbox[3].label2.setText("");
        this.hbox[4].textArea.setText("");
    }

    private void checkAction(ActionEvent e) {
        if (this.hbox[2].checkBox[0].isSelected()) {
            this.hbox[2].checkBox[1].setSelected(false);
        }
        if (this.hbox[2].checkBox[1].isSelected()) {
            this.hbox[2].checkBox[0].setSelected(false);
        }
    }

}

package login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class HorijantalBox {

    HBox box1;
    Label label1;
    Label label2;
    TextField text;
    Button btn1;
    Button btn2;
    Button btn3;
    Insets insets = new Insets(20, 20, 10, 40);
    ChoiceBox choiceBox;
    TextArea textArea;
    CheckBox[] checkBox = new CheckBox[2];

    public HorijantalBox(String strLabel1, String strText, String strLabel2) {
        this.label1 = new Label(strLabel1);
        this.label2 = new Label(strLabel2);
        this.text = new TextField(strText);
        this.box1 = new HBox(20, label1, text, label2);
        this.box1.setPadding(insets);
        this.box1.setAlignment(Pos.CENTER);
    }

    public HorijantalBox(double btnSize ,String strBtn1, String strBtn2, String strBtn3) {
        this.btn1 = new Button(strBtn1);
        this.btn2 = new Button(strBtn2);
        this.btn3 = new Button(strBtn3);
        this.btn1.setMinWidth(btnSize);
        this.btn2.setMinWidth(btnSize);
        this.btn3.setMinWidth(btnSize);
        this.box1 = new HBox(40,btn1,btn2,btn3);
        this.box1.setPadding(insets);
        this.box1.setAlignment(Pos.CENTER);
        
    }

    public HorijantalBox(String[] choice) {
        this.label1 = new Label("Batch : ");
        this.label2 = new Label("");
        this.choiceBox = new ChoiceBox();
        for(int i=0;i<choice.length;i++){
            this.choiceBox.getItems().add(choice[i]);
        }
        this.choiceBox.setValue(choice[0]);
        this.box1 = new HBox(40,this.label1,this.choiceBox,this.label2);
        this.box1.setPadding(insets);
        this.box1.setAlignment(Pos.CENTER);
    }

    public HorijantalBox(String strLabel) {
        this.label1 = new Label(strLabel);
        this.textArea = new TextArea();
        this.textArea.setScaleX(.9);
        this.textArea.setScaleY(1);
        this.textArea.setWrapText(true);
        this.box1 = new HBox(40,this.label1,this.textArea);
        this.box1.setPadding(insets);
        this.box1.setAlignment(Pos.TOP_CENTER);
    }

    public HorijantalBox(String strLabel,String[] options) {
        this.label1 = new Label(strLabel);
        this.label2 = new Label();
        this.box1 = new HBox(35,this.label1);
        for(int i=0;i<options.length;i++){
            this.checkBox[i] = new CheckBox(options[i]);
            this.box1.getChildren().add(this.checkBox[i]);
        }
        this.box1.getChildren().add(this.label2);
        this.box1.setPadding(insets);
        this.box1.setAlignment(Pos.CENTER);
    }
    
    public HBox getHBox1() {
        return this.box1;
    }
}
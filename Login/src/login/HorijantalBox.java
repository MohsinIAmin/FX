package login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class HorijantalBox {

    HBox box1;
    HBox box2;
    Label label1;
    Label label2;
    TextField text;
    Button btn1;
    Button btn2;
    Button btn3;
    Insets insets = new Insets(20, 20, 10, 40);

    public HorijantalBox(String strLabel1, String strText, String strLabel2) {
        label1 = new Label(strLabel1);
        label2 = new Label(strLabel2);
        text = new TextField(strText);
        box1 = new HBox(20, label1, text, label2);
        //box1.setAlignment(Pos.TOP_LEFT);
        //box1.setPadding(new Insets(15, 12, 10, 180));
        box1.setPadding(insets);
        box1.setAlignment(Pos.CENTER);
    }

    public HorijantalBox(int num ,String strBtn1, String strBtn2, String strBtn3) {
        btn1 = new Button(strBtn1);
        btn2 = new Button(strBtn2);
        btn3 = new Button(strBtn3);
        box2 = new HBox(40,btn1,btn2,btn3);
        box2.setPadding(insets);
        box2.setAlignment(Pos.CENTER);
        
    }

    public HBox getHBox() {
        return box1;
    }

    public HBox getHBox2() {
        return box2;
    }

}

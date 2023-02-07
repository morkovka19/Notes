package lab_6.View.Graghic.Elements;

import javax.swing.*;
import java.awt.*;

//создание текстого поля

public class Text extends JTextField {
    public Text(String st){
        super(st);
        try {
            this.setFont(Font.getFont("Verdana"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

package lab_6.View.Graghic.Elements;

import javax.swing.*;
import java.awt.*;

//создание строки

public class Label extends JLabel {

    public Label(String  name){
        super(name);
        try {
            this.setVerticalAlignment(JLabel.CENTER);
            this.setFont(new Font("Verdana", Font.PLAIN, 15));
            this.setPreferredSize(new Dimension(250, 100));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

package lab_6.View.Graghic.Elements;

import javax.swing.*;
import java.awt.*;

//создание кнопки

public class Button  extends JButton {

    public Button(String name){
        super(name);
        try {
            super.setFont(new Font("Verdana", Font.PLAIN, 15));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}

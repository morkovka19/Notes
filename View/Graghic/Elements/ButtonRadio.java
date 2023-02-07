package lab_6.View.Graghic.Elements;

import javax.swing.*;
import java.awt.*;

//создание радио кнопки

public class ButtonRadio extends JRadioButton {
    public ButtonRadio(String name, boolean b){
        super(name, b);
        try {
            super.setFont(new Font("Verdana", Font.PLAIN, 15));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

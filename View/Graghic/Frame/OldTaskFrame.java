package lab_6.View.Graghic.Frame;
import lab_6.View.Graghic.Event.ButtonEventClose;
import lab_6.View.Graghic.Frame.My_App;
import lab_6.View.Graghic.Elements.Label;
import lab_6.View.Graghic.Elements.Button;

import javax.swing.*;
import java.awt.*;

public class OldTaskFrame extends JFrame {

    public OldTaskFrame() {
        //устанавливаем все параметры фрейма
        super("Список задач");
        super.setBounds(200, 200, 750, 500);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//приложение не закроется при закрытие окна

        try {

            Container container;
            container = super.getContentPane();
            container.setLayout(new GridLayout(20, 1, 5, 5));//устанавливаем разметку сетка
            if (My_App.tasks_list.size() == 0) {
                Label label = new Label("Список задач пуст");
                container.add(label);
            } else {
                Label label_1 = new Label("Список задач");
                container.add(label_1);
                for (int i = 0; i < My_App.tasks_list.size(); i++) {
                    String buff = My_App.tasks_list.get(i).ToString();
                    Label label = new Label(buff);
                    container.add(label);
                }
            }

            //кнопка для закрытия фрейма
            Button close = new Button("Закрыть");
            //добавляем событие для закрытия фрейма
            close.addActionListener(new ButtonEventClose());
            container.add(close);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    //закрытие фрейма

    public void CloseFrame(){
        try {
            dispose();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

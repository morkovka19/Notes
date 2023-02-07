package lab_6.View.Graghic.Event;

import lab_6.View.Graghic.Frame.TaskFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//создание новой задачи
public class ButtonEventNew implements ActionListener {
    static public TaskFrame task; //фрейм для создания новой задачи

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            task = new TaskFrame();
            task.setVisible(true);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}




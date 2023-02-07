package lab_6.View.Graghic.Event;

import lab_6.View.Graghic.Frame.My_App;
import lab_6.View.Graghic.Frame.OldTaskFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//кнопка для просмотра списка созданных задач
public  class ButtonEventOld implements ActionListener {
    public static OldTaskFrame task;
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            task = new OldTaskFrame();//создание фрейма со списком старых задач
            task.setVisible(true);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        }


    }


package lab_6.View.Graghic.Event;
import lab_6.View.Graghic.Frame.OldTaskFrame;
import lab_6.View.Graghic.Event.ButtonEventOld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//закрыть фрейм со списком задач
public class ButtonEventClose implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            ButtonEventOld.task.CloseFrame();//закрыть фрейм со списком задач
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

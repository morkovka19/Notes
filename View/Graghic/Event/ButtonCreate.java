package lab_6.View.Graghic.Event;

import lab_6.View.Graghic.Frame.TaskFrame;
import lab_6.View.Graghic.Frame.My_App;
import lab_6.Model.Task;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//событие при создании задачи "Создать"


public class ButtonCreate implements ActionListener {
    //public String task = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String task = "";
            //проверка введенных данных
            if (!(TaskFrame.text.getText().equals("") || TaskFrame.text_time.getText().equals(""))) {

                //добавление данных в новую строку
                Task task_ = new Task();

                task_.getTask(TaskFrame.text.getText());
                Boolean br1, br2, br3;
                br1 = TaskFrame.but_easy.isSelected();
                br2 = TaskFrame.but_mid.isSelected();
                br3 = TaskFrame.but_har.isSelected();
                if (br1) {
                    task_.getInp("Не важная");
                } else if (br2) {
                    task_.getInp("Важная");
                } else if (br3) {
                    task_.getInp("Очень важная");
                }

                task_.getTime(TaskFrame.text_time.getText());



                //изменение данных о цвете
                br1 = TaskFrame.white.isSelected();
                br2 = TaskFrame.red.isSelected();
                br3 = TaskFrame.yellow.isSelected();
                if (br1) {
                    My_App.color = "white";
                } else if (br2) {
                    My_App.color = "red";
                } else if (br3) {
                    My_App.color = "yellow";
                }
                //добавление новой задачи в общий массив

                My_App.tasks_list.add(task_);

                JOptionPane.showMessageDialog(null, "Задача добавлена", "Новая задача", JOptionPane.PLAIN_MESSAGE);
                ButtonEventNew.task.CloseFrame();


            } else {
                //сообщение обощибке при создании задачи
                JOptionPane.showMessageDialog(null, "Нужно заполнить все поля. Попробуйте еще раз", "Новая задача", JOptionPane.PLAIN_MESSAGE);


            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
}

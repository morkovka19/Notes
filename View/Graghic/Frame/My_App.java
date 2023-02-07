package lab_6.View.Graghic.Frame;

import lab_6.Model.Task;
import lab_6.View.Graghic.Elements.Button;
import lab_6.View.Graghic.Event.ButtonEventNew;
import lab_6.View.Graghic.Event.ButtonEventOld;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


//создание основного фрейма
public class My_App extends JFrame {

    public static ArrayList<Task> tasks_list; //список всех задач
    public static String color = "white"; //цвет формы создания новой задачи
    Container container; //контейнер для фрейма

    public My_App() {

        //устанавливаем все параметры для фрейма

        super("Dairy");
        super.setBounds(200, 200, 500, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            tasks_list = new ArrayList<>();

            //разметка фрейма


            container = super.getContentPane();
            container.setLayout(new GridLayout(2, 2, 10, 10));//устанавливаем разметку сетка

            //кнопки

            Button button_new_task = new Button("Новая задача");
            container.add(button_new_task);
            Button button_old_tasks = new Button("Список задач");
            container.add(button_old_tasks);

            //событие

            button_new_task.addActionListener(new ButtonEventNew()); //для создания новой задачи
            button_old_tasks.addActionListener(new ButtonEventOld()); //для просмотра списка старых задач


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }





    }



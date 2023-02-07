package lab_6.View.Graghic.Frame;


import lab_6.View.Graghic.Elements.ButtonRadio;
import lab_6.View.Graghic.Elements.Button;
import lab_6.View.Graghic.Elements.Label;
import lab_6.View.Graghic.Event.ButtonCreate;
import lab_6.View.Graghic.Event.ButtonEventNew;
import lab_6.View.Graghic.Elements.*;

import javax.swing.*;
import java.awt.*;

//фрем для создания новой задачи
public class TaskFrame extends JFrame {
    Container container;
    public static Text text = new Text("");
    public static Text text_time = new Text("");
    public static ButtonRadio white = new ButtonRadio("Белый", true);
    public static ButtonRadio yellow = new ButtonRadio("Желтый", false);
    public static ButtonRadio red = new ButtonRadio("Красный", false);
    public  static ButtonRadio but_easy = new ButtonRadio("Не важная", true);
    public static ButtonRadio but_mid = new ButtonRadio("Важная", false);
    public static ButtonRadio but_har = new ButtonRadio("Очень важная", false);



    public TaskFrame() {

        //устанавливаем параметры фрейма и  разметку

        super("Новая задача");
        super.setBounds(200, 200, 750, 500);


        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //приложение не закроется при закрытие окна

        try {
            text = new Text("");
            text_time = new Text("");
            white = new ButtonRadio("Белый", true);
            yellow = new ButtonRadio("Желтый", false);
            red = new ButtonRadio("Красный", false);
            but_easy = new ButtonRadio("Не важная", true);
            but_mid = new ButtonRadio("Важная", false);
            but_har = new ButtonRadio("Очень важная", false);

            container = super.getContentPane();

            //устанавливанеи цвет в зависимоти от указанного значения
            if (My_App.color.equals("white")) {
                container.setBackground(Color.WHITE);
            } else if (My_App.color.equals("yellow")) {
                container.setBackground(Color.YELLOW);
            } else if (My_App.color.equals("red")) {
                container.setBackground(Color.RED);
            } else {
                container.setBackground(Color.WHITE);
            }

            //УСТАНАВЛИВАЕМ РАЗМЕТКУ

            GridBagLayout gbl = new GridBagLayout();
            container.setLayout(gbl);
            GridBagConstraints table = new GridBagConstraints();

            table.anchor = GridBagConstraints.WEST; //центрирования
            table.fill = GridBagConstraints.NONE; //заполнение ячейки
            table.gridheight = 1;//кол во занимаемых ячеек
            table.gridwidth = 1;
            table.weightx = 0.0;
            table.weighty = 0.0;
            table.gridx = GridBagConstraints.RELATIVE;//координаты ячейки
            table.gridy = GridBagConstraints.RELATIVE;
            table.insets = new Insets(40, 0, 0, 0);//отступы
            table.ipadx = 0;
            table.ipady = 0;

            //ДОБАВЛЕНИЕ ЭЛЕМЕНТОВ

            Label name = new Label("Задача");
            gbl.setConstraints(name, table);
            container.add(name);

            table.fill = GridBagConstraints.HORIZONTAL;
            table.gridwidth = 2;
            table.weightx = 0.2;

            gbl.setConstraints(text, table);
            container.add(text);

            table.fill = GridBagConstraints.NONE;
            table.gridwidth = 1;
            table.weightx = 0.0;
            table.gridx = 0;
            table.gridy = 1;
            table.insets = new Insets(40, 2, 2, 2);

            Label name_but = new Label("Важность");

            gbl.setConstraints(name_but, table);
            container.add(name_but);

            ButtonGroup group_1 = new ButtonGroup(); //объединям в группу кнопки важности
            group_1.add(but_easy);
            group_1.add(but_mid);
            group_1.add(but_har);

            table.gridx = 1;
            table.gridy = 1;

            gbl.setConstraints(but_easy, table);
            container.add(but_easy);

            table.gridx = 2;
            table.gridy = 1;

            gbl.setConstraints(but_mid, table);
            container.add(but_mid);

            table.gridx = 3;
            table.gridy = 1;


            gbl.setConstraints(but_har, table);
            container.add(but_har);


            table.gridx = 0;
            table.gridy = 2;

            Label time = new Label("Время");

            gbl.setConstraints(time, table);
            container.add(time);


            table.fill = GridBagConstraints.HORIZONTAL;
            table.gridwidth = 2;
            table.weightx = 0.2;
            table.gridx = 1;
            table.gridy = 2;

            gbl.setConstraints(text_time, table);
            container.add(text_time);

            table.gridwidth = 1;
            table.weightx = 0.0;
            table.gridx = 0;
            table.gridy = 3;

            Label color = new Label("Цвет фона");

            gbl.setConstraints(color, table);
            container.add(color);


            ButtonGroup group_2 = new ButtonGroup();//объединям в группу кнопки цвета
            group_2.add(red);
            group_2.add(yellow);
            group_2.add(white);


            table.weightx = 1;
            table.gridx = 1;
            table.gridy = 3;
            table.anchor = GridBagConstraints.WEST;

            gbl.setConstraints(white, table);
            container.add(white);

            table.anchor = GridBagConstraints.EAST;
            table.gridx = 2;
            table.gridy = 3;

            gbl.setConstraints(yellow, table);
            container.add(yellow);

            table.gridx = 3;
            table.gridy = 3;
            table.anchor = GridBagConstraints.WEST;


            gbl.setConstraints(red, table);
            container.add(red);

            Button create = new Button("Создать задачу");
            table.gridx = 0;
            table.gridy = 4;
            table.anchor = GridBagConstraints.CENTER;
            gbl.setConstraints(create, table);
            container.add(create);

            //событие
            create.addActionListener(new ButtonCreate());


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    //закрыть фрейм
    public void CloseFrame() {
        try {
            dispose();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }


}

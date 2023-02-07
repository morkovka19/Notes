package lab_6;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;
import lab_6.Controller.Preloader;
import lab_6.Logger.*;

import lab_6.View.Graghic.Frame.My_App;

public class lab_6 {
    static public BaseLogger logger;

    public static void main(String[] args) throws IOException {
        logger = new Logger("logs.txt");
        try {
            //работа с конфигурацией

            Properties prop = new Properties();

            Preloader PRL = new Preloader("settings.properties", prop);

            System.out.println("Добро пожаловать, " + prop.getProperty("LOGIN"));
            System.out.println("Group " + prop.getProperty("GROUP"));
            System.out.println("LR " + prop.getProperty("NUMBER_LR"));
            boolean is_logger_needed = true;


            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run(){
                    try {

                        My_App app = new My_App();
                        app.setVisible(true);
                        logger.log("Запуск приложения");
                    }catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }

                }

            });
            logger.log("Конец работы приложения");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            logger.log(ex.getMessage());
        }
    }
}

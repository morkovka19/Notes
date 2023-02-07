package lab_6.Model;

public class Task {
    String task = "";
    String important = "";
    String time = "";

    public Task(){
        task = "";
        important = "";
        time = "";
    }
    public Task(String task, String important, String time){
        this.task = task;
        this.important = important;
        this.time = time;
    }

    public void getTask(String buff){
        task = buff;
    }
    public void getTime(String buff){
        time = buff;
    }
    public void getInp(String buff){
        important = buff;
    }

    public String ToString(){
        String buff = "\n" + task + "     Важность: " + important + "     Время: " + time + "\n";
        return buff;

    }

}

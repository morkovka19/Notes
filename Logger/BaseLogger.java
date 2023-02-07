package lab_6.Logger;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BaseLogger {
    String name="";
    public BaseLogger(String fileName) throws IOException {
        // Do nothing
    }

    public boolean log(String message) throws IOException {
        // Do nothing
        return true;
    }

    public boolean closeFile() throws IOException {
        return true;
    }

    public String getName(){
        return name;
    }
}

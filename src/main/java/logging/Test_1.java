package logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test_1 {

    public static void main(String[] args) {

        try {
            System.out.println("hello1");

            FileHandler fileHandle = new FileHandler("D:\\Java Full Stack\\myLog.log");
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandle.setFormatter(simpleFormatter);
            //get the logger object
            Logger log = Logger.getLogger("Test_1");

            log.addHandler(fileHandle);
            log.log(Level.SEVERE, "Server is not responding");
            log.log(Level.WARNING, "3 invalid login attempts");

            System.out.println("hello2");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

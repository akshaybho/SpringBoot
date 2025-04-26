package main;

import com.example.demo.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("mapnApplication.xml");

        Man m = (Man)context.getBean("manId1");
        m.display();
    }
}

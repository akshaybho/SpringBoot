package InitilizeMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("initialize.xml");

        Student std = (Student)context.getBean("std");
        std.display();
    }
}

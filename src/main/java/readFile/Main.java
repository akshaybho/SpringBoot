package readFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("readFileapp.xml");

        Student std = (Student)context.getBean("stdId");
        std.display();

    }
}

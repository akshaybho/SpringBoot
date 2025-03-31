package autowireXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("D:\\ak\\demo\\src\\main\\resources\\autowireContext.xml");

        Student std = (Student) context.getBean("stdId");
        std.display();
    }
}

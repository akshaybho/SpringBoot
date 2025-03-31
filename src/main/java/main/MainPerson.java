package main;

import com.example.demo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import resourceConf.SpringConfigPerson;

public class MainPerson {

    public static void main(String[] args) {

        //String filePath = "apContext.xml";

        //ApplicationContext context = new ClassPathXmlApplicationContext(filePath);

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigPerson.class);

        Person p = (Person)context.getBean("person");
        p.display();
    }
}

package AnnotationAutowirePractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigp.class);

        Person prn = context.getBean(Person.class);
        prn.display();
    }
}

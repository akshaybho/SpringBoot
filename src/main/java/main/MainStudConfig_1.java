package main;

import com.example.demo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resourceConf.StudentConfig_1;

public class MainStudConfig_1 {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig_1.class);

        Student std1 = (Student)context.getBean("stdObj1");
        std1.display();

        System.out.println("===================================================");
        Student std2 = (Student)context.getBean("stdObj2");
        std2.display();
    }
}

package main;

import com.example.demo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resourceConf.StudentConfig;
import resourceConf.StudentConfig_1;

public class MainStudConfig {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        Student std = (Student)context.getBean("stdobj");
        std.display();



    }
}

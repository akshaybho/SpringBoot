package main;

import autowire.Student_3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resourceConf.SpringAuto;

public class MainAuto {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAuto.class);

        Student_3 std = context.getBean(Student_3.class);

        std.display();
    }
}

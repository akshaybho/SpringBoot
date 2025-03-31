package main;

import com.example.demo.Student_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resourceConf.SpringComfigFile;

public class Main_1 {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringComfigFile.class);

        Student_1 std = (Student_1) context.getBean("stdId3");
        std.display();

    }
}

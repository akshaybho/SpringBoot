package AutowireByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigAnno.class);

        Student std = context.getBean(Student.class);
        std.display();
    }
}

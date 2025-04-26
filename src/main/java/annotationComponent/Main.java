package annotationComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //Using config java file

        //context.register(Student_b.class);
        //context.refresh();

        ApplicationContext context = new ClassPathXmlApplicationContext("D:\\ak\\demo\\src\\main\\java\\annotation\\applicationContext.xml");
// using xml
        Student_b bs = (Student_b)context.getBean("student_b");
        bs.display();

    }
}

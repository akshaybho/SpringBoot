package SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpELApplication_1.xml");

        SpelUser user = (SpelUser)context.getBean("mySpelUser");
        user.printInfo();
    }
}

package main;

import constructordi.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCompany {

    public static void main(String[] args) {

        String path = "company.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);

        Company c = (Company)context.getBean("cId");
        c.display();
    }
}

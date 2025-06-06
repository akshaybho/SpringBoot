package main;

import circularDI.Student;
import circularDI.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCircular {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("circularAppl.xml");

        Student std = (Student)context.getBean("stdId");
        std.studentDisplay();

        System.out.println("===============================================================");

        Teacher tch = (Teacher)context.getBean("teachId");
        tch.teacherDisplay();
    }
}

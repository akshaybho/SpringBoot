package AnnotationAutowirePractice;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    private String name;
    private int age;
    @Autowired
    private People people;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Countries : "+people);
    }
}

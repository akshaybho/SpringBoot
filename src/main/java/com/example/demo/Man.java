package com.example.demo;

public class Man {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

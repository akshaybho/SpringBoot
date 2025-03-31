package com.example.demo;

public class Student_1 {
    private String name;
    private int rollNo;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void display()
    {
        System.out.println("name : "+name);
        System.out.println("rollNo : "+rollNo);
        System.out.println("age : "+age);
    }
}

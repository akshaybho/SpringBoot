package autowire;

import org.springframework.beans.factory.annotation.Autowired;

import javax.security.auth.Subject;

public class Student_3 {

    private int rollno;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    private String name;

    @Autowired
    private Address add;


    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    @Autowired
    private Subjects subjects;

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
        System.out.println("Address : "+add);
        System.out.println("Subjects : "+subjects);
    }
}

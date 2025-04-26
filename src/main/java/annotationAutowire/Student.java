package annotationAutowire;

import AutowireByAnnotation.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    private int rollno;

    @Autowired
    private Subjects subjects;



    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Subjects : "+subjects);
    }
}

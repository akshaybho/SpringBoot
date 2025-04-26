package AutowireByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private int rollno;

    @Autowired
    private Address address;

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Address : "+address);
    }
}

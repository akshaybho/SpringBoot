package readJavaConfig;

import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    private String name;
    private int rollno;
    private List<String> subjects;

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+rollno);
        System.out.println("Subjects : "+subjects);
    }
}

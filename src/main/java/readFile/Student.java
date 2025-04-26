package readFile;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Map;

public class Student {



    private String name;

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

    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(Map<String, Integer> subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    private int rollno;
    private Map<String, Integer> subjectMarks;

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
        System.out.println("Subject & Marks : "+subjectMarks);
    }
}

package listProperty;

import java.util.List;

public class Student {
    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    private List<String> subjects;

    public void display()
    {
        System.out.println("Subjects : "+subjects);
    }
}

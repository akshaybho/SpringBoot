package circularDI;

public class Student {

    Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void studentDisplay()
    {
        System.out.println("I am in student method : "+teacher);
    }
}

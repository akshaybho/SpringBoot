package circularDI;

public class Teacher {
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    Student student;

    public void teacherDisplay()
    {
        System.out.println("I am in teacher method : "+student);
    }
}

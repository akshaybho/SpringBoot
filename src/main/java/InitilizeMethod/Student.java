package InitilizeMethod;

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

    private int rollno;

    public void initialize()
    {
        name = "tiger";
        rollno = 1;
    }
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+rollno);
    }

}

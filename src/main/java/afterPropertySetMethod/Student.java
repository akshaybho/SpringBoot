package afterPropertySetMethod;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean {

    private String name;
    private int rollno;

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
    }


    @Override
    public void afterPropertiesSet() throws Exception {

        name = "deepak";
        rollno = 111;
    }
}

package resourceConf;

import autowire.Address;
import autowire.Student_3;
import autowire.Subjects;
import org.springframework.context.annotation.Bean;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class SpringAuto {

    @Bean
    public Address createAddrObj()
    {
        Address add = new Address();
        add.setCity("Pune");
        add.setHouseno(810);
        add.setPincode(411036);
        return add;
    }

    @Bean
    public Student_3 createStdObj()
    {
        Student_3 std = new Student_3();
        std.setName("Akshay");
        std.setRollno(109130);
        //std.setAdd(createAddrObj());   //manually DI
        //std.setSubjects(createSubObj());
        return std;
    }

    @Bean
    public Subjects createSubObj()
    {
        Subjects sub = new Subjects();

        List<String> subject_list = new ArrayList<String>();
        subject_list.add("Java");
        subject_list.add("Javascript");
        subject_list.add("spring boot");

        return sub;
    }
}

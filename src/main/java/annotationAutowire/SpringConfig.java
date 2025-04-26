package annotationAutowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public Subjects createSubObj()
    {
        Subjects sb = new Subjects();

        List <String> subjectList = new ArrayList<>();

        subjectList.add("FM");
        subjectList.add("TOM");
        subjectList.add("SOM");
        subjectList.add("MATHS");
        sb.setMySubjects(subjectList);

        return sb;
    }

    @Bean
    public Student createStuObj()
    {
        Student std = new Student();

        std.setName("Akshay");
        std.setRollno(52);

        return std;
    }
}

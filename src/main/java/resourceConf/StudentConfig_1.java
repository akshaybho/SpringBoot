package resourceConf;

import com.example.demo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig_1 {

        @Bean(name = "stdObj1")
        public Student createObj()
        {
            Student std = new Student();

            std.setName("Alias");
            std.setRollNo(1546);
            std.setAge("56");

            return std;
        }

    @Bean(name = "stdObj2")
    public Student createObj2()
    {
        Student std = new Student();

        std.setName("Akshay");
        std.setRollNo(109130);
        std.setAge("30");

        return std;
    }
    }


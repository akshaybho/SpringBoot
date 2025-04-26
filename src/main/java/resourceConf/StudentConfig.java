package resourceConf;

import com.example.demo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student stdobj()
    {
        Student std = new Student();

        std.setName("Java");
        std.setRollNo(99);
        std.setAge("32");

        return std;
    }
}

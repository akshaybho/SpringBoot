package resourceConf;

import com.example.demo.Student_1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringComfigFile {

    @Bean
    public Student_1 stdId3()
    {
        Student_1 std = new Student_1();

        std.setName("Rahul");
        std.setRollNo(25);
        std.setAge("21");
        return std;
    }
}

package AutowireByAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigAnno {

    @Bean
    public Address createAddrObj()
    {
        Address addr = new Address();

        addr.setCity("Pune");
        addr.setPincode(431006);

        return addr;
    }

    @Bean
    public Student createStudObj()
    {
        Student std = new Student();

        std.setName("Akshay");
        std.setRollno(23);

        return std;
    }
}

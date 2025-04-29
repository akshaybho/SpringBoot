package AnnotationAutowirePractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JavaConfigp {

    @Bean
    public Person createPersonObj()
    {
        Person pr = new Person();
        pr.setName("Madhav");
        pr.setAge(56);

        return pr;
    }

    @Bean
    public People createpeopleObj()
    {
        People pl = new People();

        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("Australia");
        list.add("England");
        list.add("Newzealand");
        pl.setCountries(list);

        return pl;

    }
}

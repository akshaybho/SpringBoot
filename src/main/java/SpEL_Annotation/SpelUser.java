package SpEL_Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelUser {

    @Value("#{myBean.message}")
    private String msg;

    @Value("#{myBean.value*2}")
    private int doubleValue;

    @Value("#{myBean.message.length()}")
    private int length;

    public void display()
    {
        System.out.println("Message : "+msg);
        System.out.println("Double Value : "+doubleValue);
        System.out.println("Length : "+length);
    }
}

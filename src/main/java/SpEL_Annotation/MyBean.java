package SpEL_Annotation;

import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {

    public String getMessage() {
        return message;
    }

    public int getValue() {
        return value;
    }

    private String message = "Hello Akshay";
    private int value = 5;
}

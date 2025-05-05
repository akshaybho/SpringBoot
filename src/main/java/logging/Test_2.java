package logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_2 {

    private static final Logger log = LoggerFactory.getLogger(Test_2.class);

    public static void main(String[] args) {


        log.info("This is an info message");
        log.debug("This is a debug message");
        log.error("This is an error message");


    }
}

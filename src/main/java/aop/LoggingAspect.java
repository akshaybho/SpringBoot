package aop;

public class LoggingAspect {

    public void myLogging()
    {
        System.out.println("----- before logging -----");
    }

    public void myAfterLog()
    {
        System.out.println("----- after logging -----");
    }


}

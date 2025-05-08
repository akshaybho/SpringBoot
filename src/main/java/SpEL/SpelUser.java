package SpEL;

public class SpelUser {

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDoubleValue(int doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private String msg;
    private int doubleValue;
    private int length;

    public void printInfo() {
        System.out.println("Message: " + msg);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Length of Message: " + length);
    }
}

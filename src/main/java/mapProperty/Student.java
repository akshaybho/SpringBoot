package mapProperty;

import java.util.Map;

public class Student {
    public Map<String, Integer> getSubjmarks() {
        return subjmarks;
    }

    public void setSubjmarks(Map<String, Integer> subjmarks) {
        this.subjmarks = subjmarks;
    }

    private Map<String, Integer> subjmarks;

    public void display()
    {
        System.out.println("Subject & Marks : "+subjmarks);
    }

}

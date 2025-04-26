package annotationAutowire;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Subjects {


    private List<String> mySubjects;

    public void setMySubjects(List<String> mySubjects) {
        this.mySubjects = mySubjects;
    }

    @Override
    public String toString() {
        return mySubjects.toString();
    }
}

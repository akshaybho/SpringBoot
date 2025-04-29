package AnnotationAutowirePractice;

import java.util.List;

public class People {

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    private List<String> countries;

    @Override
    public String toString() {
        return countries.toString();
    }
}

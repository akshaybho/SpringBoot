package designPatterns.abstractFactory;

public class MacCheckbox implements Checkboxes{

    @Override
    public void render() {

        System.out.println("Mac style Checkbox");
    }
}

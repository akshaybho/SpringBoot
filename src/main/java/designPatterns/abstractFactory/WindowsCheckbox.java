package designPatterns.abstractFactory;

public class WindowsCheckbox implements Checkboxes{

    @Override
    public void render() {

        System.out.println("Windows style Checkbox");
    }
}

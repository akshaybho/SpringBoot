package designPatterns.abstractFactory;

public class WindowsButton implements Button {

    @Override
    public void paint() {

        System.out.println("Windows style Button");
    }
}

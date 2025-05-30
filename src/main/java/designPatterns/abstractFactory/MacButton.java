package designPatterns.abstractFactory;

public class MacButton implements Button{

    @Override
    public void paint() {

        System.out.println("Mac style Button");
    }
}

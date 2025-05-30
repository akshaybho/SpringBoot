package designPatterns.abstractFactory;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkboxes createCheckbox() {
        return new MacCheckbox();
    }
}

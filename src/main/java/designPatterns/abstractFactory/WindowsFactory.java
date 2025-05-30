package designPatterns.abstractFactory;

public class WindowsFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkboxes createCheckbox() {
        return new WindowsCheckbox();
    }
}

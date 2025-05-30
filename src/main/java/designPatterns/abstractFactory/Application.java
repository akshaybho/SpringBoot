package designPatterns.abstractFactory;

public class Application {

    private Button button;
    private Checkboxes checkbox;

    public Application(GUIFactory factory)
    {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void ui()
    {
        button.paint();
        checkbox.render();
    }

    public static void main(String[] args) {

        GUIFactory factory;

        String os = "Windows";

        if(os.equals("Mac"))
        {
            factory = new WindowsFactory();
        }
        else
        {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.ui();
    }
}

package designPatterns.Factory;

public class AutomationTester implements Employee{
    @Override
    public int salary() {

        System.out.println("Automation salary");
        return 50000;
    }
}

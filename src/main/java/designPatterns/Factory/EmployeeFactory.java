package designPatterns.Factory;

public class EmployeeFactory {

    //get the employee
    public static Employee getEmployee(String empType)
    {
        if(empType.trim().equalsIgnoreCase("Automation Tester"))
        {
            return new AutomationTester();
        }
        else if(empType.trim().equalsIgnoreCase("java developer"))
        {
            return new JavaDevloper();
        }
        else
        {
            return null;
        }
    }
}

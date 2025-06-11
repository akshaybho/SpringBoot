package designPatterns.Factory;

public class DeveloperClient {

    public static void main(String[] args) {

        Employee emp = EmployeeFactory.getEmployee("java developer");
        System.out.println(emp.salary());
    }
}

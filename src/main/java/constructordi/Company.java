package constructordi;

public class Company {

    private String companyName;
    private int pincode;
    private Employee emp;

    public Company(String companyName, int pincode, Employee emp) {
        this.companyName = companyName;
        this.pincode = pincode;
        this.emp = emp;
    }

    public void display()
    {
        System.out.println("companyName : "+companyName);
        System.out.println("pincode : "+pincode);
        System.out.println("emp : "+emp);
    }
}

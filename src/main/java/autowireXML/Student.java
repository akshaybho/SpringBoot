package autowireXML;

public class Student {

    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private String name;
    private Address address;
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
        System.out.println("Address : "+address);
    }

}

package setterdi;

public class Vehicle {

    private String name;
    private int number;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCar(Car car) {
        this.car = car;
    }

   public void display()
   {
       System.out.println("Vehicle name : "+ name);
       System.out.println("Vehicle number : "+number);
       System.out.println("Car : "+car);
   }

}

package AutowireByAnnotation;

public class Address {

    private String city;
    private int pincode;

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "City : "+city+"\n"+"Pincoe : "+pincode;
    }
}

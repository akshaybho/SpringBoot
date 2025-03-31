package autowire;

public class Address {

    private int houseno;

    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    private String city;
    private int pincode;

    @Override
    public String toString() {
        return " # "+houseno+" # "+city+" # "+pincode;
    }
}

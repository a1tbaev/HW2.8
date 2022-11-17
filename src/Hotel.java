public class Hotel extends All implements RentAble{


    public Hotel(String address) {
        super(address);
    }

    @Override
    public void getCash() {
        System.out.println("Payment of Hotel per month 7000 soms");
    }

    @Override
    public String toString() {
        return "Hotel{" + getAddress() + "}";
    }
}

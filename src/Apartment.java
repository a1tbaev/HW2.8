public class Apartment extends All implements PayAble{

    public Apartment(String address) {
        super(address);
    }

    @Override
    public void getCash() {
        System.out.println("Payment per month 500 soms ");
    }

    @Override
    public String toString() {
        return "Apartment{" + getAddress() + "}";
    }
}

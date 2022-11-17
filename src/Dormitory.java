public class Dormitory extends All implements RentAble{


    public Dormitory(String address) {
        super(address);
    }

    @Override
    public void getCash() {
        System.out.println("Payment of dormitory per month 4000 soms");
    }

    @Override
    public String toString() {
        return "Dormitory{ " + getAddress() + "}";
    }
}

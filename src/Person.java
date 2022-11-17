public class Person {
    private String name;
    private int age;
    private All address;

    public Person(String name, int age, All address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public All getAddress() {
        return address;
    }

    public void setAddress(All address) {
        this.address = address;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Apartment apartment = new Apartment("jal");
        Person person = new Person("Adil", 12, apartment);
        Person person1 = new Person("Aibek", 12, apartment);
        Person[] people = {person1, person};

        Dormitory dormitory = new Dormitory("Kok - jar");
        Person person2 = new Person("Rahim", 13, dormitory);
        Person person3 = new Person("Mukhammed", 13, dormitory);
        Person person6 = new Person("Maksat", 13, dormitory);
        Person[] people1 = {person2, person3, person6};

        Hotel hotel = new Hotel("Dostuk");
        Person person4 = new Person("Aigerim", 14, hotel);
        Person person5 = new Person("Kanykei", 14, hotel);
        Person person7 = new Person("Nuriza", 14, hotel);
        Person person8 = new Person("Nurkyz", 14, hotel);
        Person[] people2 = {person4, person5, person7, person8};

        System.out.println("number of peoples apartment " + numberOfPeople(people));
        System.out.println("number of peoples dormitory " + numberOfPeople(people1));
        System.out.println("number of peoples hotel " + numberOfPeople(people2));

        Person[] peoples = {person, person1, person2, person3, person4, person5, person6, person7, person8};
        System.out.println("write name of person: ");
        findByName(scanner.next(), peoples);
    }
    public static int numberOfPeople(Person[] people){
        int i = 0;
        for (Person person:people) {
            i++;
        }
        return i;
    }
    public static void findByName(String name , Person[] people){
        for (Person persons:people) {
            if (persons.getName().equals(name)){
                System.out.println(persons.getAddress());
            }
        }
    }

}

public class Main{
    public static void main (String[] args) {
        Person person = new Person();
        Animal crab = new Animal("yellowish-brown", 3.45);
        crab.Speaks();
        LandAnimal dog = new LandAnimal("brown", 35.34, "Short-haired");
        dog.move();
        dog.habitat();
        person.setName("Jane Doe");
        person.getName();
        person.displayName();System.out.println("God is good");
        Person student = new Person("Joe", "Bingham University", "12345", "BHU/23/04/10/0003");
        Person staff = new Person("David", "Bingham University", "J$$fe", 2134);

    }
}
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog(1, "Shiba"));
        dogs.add(new Dog(4, "Pitbull"));
        dogs.add(new Dog(3, "Milu"));
        dogs.add(new Dog(2, "Cậu vàng"));

        Collections.sort(dogs);
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

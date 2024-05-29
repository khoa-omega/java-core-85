package backend;

import entity.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise02 {
    public static void question01() {
        Person p1 = new Person(1, "Person 1", LocalDate.of(2000, 1, 19), 6.5);
        Person p2 = new Person(2, "Person 2", LocalDate.of(1999, 1, 19), 8.5);
        Person p3 = new Person(3, "Person 3", LocalDate.of(2002, 1, 19), 3.5);
        Person p4 = new Person(4, "Person 4", LocalDate.of(2001, 1, 19), 7.5);
        Person p5 = new Person(5, "Person 5", LocalDate.of(2000, 1, 19), 8.5);
        List<Person> people = new ArrayList<>();
        people.add(p5);
        people.add(p2);
        people.add(p1);
        people.add(p4);
        people.add(p3);
        for (Person person : people) {
            System.out.println("person = " + person);
        }
        Collections.sort(people);
        for (Person person : people) {
            System.out.println("person = " + person);
        }
    }

    public static void question02() {
        Person p1 = new Person(1, "Person", LocalDate.of(2000, 1, 19), 6.5);
        Person p2 = new Person(2, "Person", LocalDate.of(1999, 1, 19), 8.5);
        Person p3 = new Person(3, "Person", LocalDate.of(2002, 1, 19), 3.5);
        Person p4 = new Person(4, "Person", LocalDate.of(2001, 1, 19), 7.5);
        Person p5 = new Person(5, "Person", LocalDate.of(2000, 1, 19), 8.5);
        List<Person> people = new ArrayList<>();
        people.add(p5);
        people.add(p2);
        people.add(p1);
        people.add(p4);
        people.add(p3);

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result != 0) {
                    return result;
                }
                result = o1.getBirthdate().compareTo(o2.getBirthdate());
                if (result != 0) {
                    return result;
                }
                return Double.compare(o2.getScore(), o1.getScore());
            }
        };
        for (Person person : people) {
            System.out.println("person = " + person);
        }
        Collections.sort(people, comparator);
        for (Person person : people) {
            System.out.println("person = " + person);
        }
    }
}

package backend;

import entity.Animal;
import entity.Employee;

public class Exercise03 {
    public static void question01() {
        Animal<Integer> a1 = new Animal<>(1, "Dog");
        Animal<Float> a2 = new Animal<>(2.5f, "Cat");
        Animal<Double> a3 = new Animal<>(5.75, "Fish");
    }

    public static <E> void question04(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public static void question05() {
        Employee<Integer> employee = new Employee<>(
                1,
                "Hùng",
                new Integer[] {1, 2, 3, 4, 5}
        );
        employee.showInfo();
        employee.showLast();
    }
}

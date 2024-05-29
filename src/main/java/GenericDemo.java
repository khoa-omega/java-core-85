import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        // T: Type
        // E: Element
        // N: Number
        // K: Key
        // V: Value
        Circle<Integer> c1 = new Circle<>(10, "Red");
        System.out.println("c1 = " + c1);
        Circle<Double> c2 = new Circle<>(5.5, "Green");
        System.out.println("c2 = " + c2);

        MyMap<Integer, String> map = new MyMap<>(1, "Java Core");
        System.out.println("map = " + map);

        print(4);
//        print("A");
//        print(map);

        // Wildcard: extends, super, ?
        Circle<Integer> c3 = new Circle<>(123, "Blue");
        List<Integer> circles = new ArrayList<>();
        printSize(circles);
    }

    public static void printSize(List<?> list) {
        System.out.println(list.size());
    }

    public static <T extends Number> void print(T type) {
        System.out.println(type);
    }
}

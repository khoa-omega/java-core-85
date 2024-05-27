import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
//        Map<Character, String> map = new LinkedHashMap<>();
//        Map<Character, String> map = new TreeMap<>();

        map.put('K', "Khoa");
        map.put('L', "Long");
        map.put('D', "Dũng");
        map.put('L', "Linh");

        for (Map.Entry<Character, String> pair : map.entrySet()) {
            System.out.println("Key: " + pair.getKey());
            System.out.println("Value: " + pair.getValue());
        }

        System.out.println("map.get('L') = " + map.get('L'));
    }
}

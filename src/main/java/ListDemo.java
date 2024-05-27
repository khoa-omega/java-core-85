import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        // Thêm vào cuối
        list.add("Con bò");
        list.add("Con trâu");

        // Thêm vào vị trí bất kì
        list.add(1, "Con mèo");

        // Kích thước
        System.out.println("list.size() = " + list.size());

        // Kiểm tra rỗng
        System.out.println("list.isEmpty() = " + list.isEmpty());

        // Kiểm tra chứa phần tử
        System.out.println("list.contains(\"Con chó\") = " + list.contains("Con chó"));

        // Lấy ra chỉ số
        System.out.println("list.indexOf(\"Con bò\") = " + list.indexOf("Con bò"));

        // Truy cập theo chỉ số
        System.out.println("list.get(2) = " + list.get(2));

        // Xóa theo chỉ số
        list.remove(2);

        // Xóa theo đối tượng
        list.remove("Con bò");

        // Xóa theo điều kiện
        list.removeIf(animal -> animal.length() > 5);

        // Xóa toàn bộ
        list.clear();

        System.out.println(list);
    }
}

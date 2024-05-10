import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String empty = "";
        String blank = "      ";
        String search = "    Samsung   ";
        String name = "Nguyễn Văn Khoa";

        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("empty.isEmpty() = " + empty.isEmpty());
        System.out.println("blank.isBlank() = " + blank.isBlank());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        System.out.println("s.contains(\"Core\") = " + s.contains("Core"));
        System.out.println("search.trim() = " + search.trim());
        String[] words = name.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
        // begin <= ... < end
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));

        // Bài tập 1: Yêu cầu người dùng nhập vào tên.
        // Sau đó viết hoa chữ cái đầu tiên của tên.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên:");
        String s1 = scanner.nextLine();
        String a1 = s1.substring(0, 1).toUpperCase()
                + s1.substring(1).toLowerCase();
        System.out.println("a1 = " + a1);

        // Bài tập 2: Yêu cầu người dùng nhập vào họ và tên.
        // Đếm số từ trong tên
        // VD: Nguyễn    Văn    Khoa -> 3
        System.out.println("Mời bạn nhập vào họ và tên:");
        String s2 = scanner.nextLine();
        String[] array = s2.split(" ");
        int count = 0;
        for (String word : array) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("Số từ: " + count);
    }
}

import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
        // Escape character
        // \" -> "
        // \' -> '
        // \\ -> \
        // \n -> xuống dòng
        // \t -> tab

        // System.out.print
        System.out.print("\"Java\" Core\n");
        System.out.print("\"Java\" Core\n");

        // System.out.println
        System.out.println("\"Java\" Core");

        // System.out.printf
        // %d: Số nguyên (byte, short, int, long)
        // %f: Số thực (float, double)
        // %s: String
        // %c: kí tự (char)
        // %n: Xuống dòng
        String name = "Khoa";
        int age = 30;
        System.out.printf("Tên của bạn là: %s, tuổi của bạn là: %d%n", name, age);
        // Căn lề
        System.out.printf("| %8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abcabcabc");
        // Làm tròn số
        System.out.printf("PI = %.3f%n", 3.1415);
        // Nhóm 3 số
        System.out.printf(Locale.ITALY, "Money = %,d%n", 1234560000);
        System.out.printf(Locale.CHINA, "Money = %,d%n", 1234560000);
        System.out.printf(Locale.JAPAN, "Money = %,d%n", 1234560000);
        System.out.printf(new Locale("vi"), "Money = %,d%n", 1234560000);
        // In hoa: %S, %C
        System.out.printf("Tên: %S%n", "khoa");
    }
}

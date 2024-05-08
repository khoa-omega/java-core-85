import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên của bạn:");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là: " + name);

        System.out.println("Nhập vào tuổi của bạn:");
        int age = scanner.nextInt();
        System.out.println("Tuổi của bạn là: " + age);

        System.out.println("Nhập vào số a:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b:");
        int b = scanner.nextInt();
        int max = a > b ? a : b;
        System.out.println("Số lớn hơn là: " + max);
    }
}

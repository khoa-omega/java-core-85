import java.util.Scanner;

public class Exercise04 {
    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên:");

        String name = scanner.nextLine();
        int length = name.length();
        for (int i = 0; i < length; i++) {
            int n = i + 1;
            int c = name.charAt(i);
            System.out.printf("Ký tự thứ %d là: %C%n", n, c);
        }
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên:");

        String s = scanner.nextLine();
        int indexOfFirstWhiteSpace = s.indexOf(' ');
        int indexOfLastWhiteSpace = s.lastIndexOf(' ');
        String firstName = s.substring(0, indexOfFirstWhiteSpace);
        String lastName = s.substring(indexOfLastWhiteSpace + 1);
        String middleName = s.substring(indexOfFirstWhiteSpace + 1, indexOfLastWhiteSpace);
        System.out.println("Họ là: " + firstName);
        System.out.println("Tên đệm là: " + middleName);
        System.out.println("Tên là: " + lastName);
    }
}

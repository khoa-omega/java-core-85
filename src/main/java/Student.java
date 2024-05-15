import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double score;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vao thông tin học sinh:");

        System.out.println("Nhập vào tên:");
        this.name = scanner.nextLine();

        System.out.println("Nhập vào hometown:");
        this.hometown = scanner.nextLine();

        this.score = 0.0;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void plusScore(double value) {
        this.score += value;
    }

    public void showInfo() {
        String rank;
        if (score < 4.0) {
            rank = "Yếu";
        } else if (score < 6.0) {
            rank = "Trung bình";
        } else if (score < 8.0) {
            rank = "Khá";
        } else {
            rank = "Giỏi";
        }
        System.out.println(name + ": " + rank);
    }
}

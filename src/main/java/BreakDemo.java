public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i == 5) {
                break; // Thoát ra khỏi vòng lặp
            }
            System.out.println(i);
        }
        System.out.println("Xong");
    }
}

public class ForIndexDemo {
    public static void main(String[] args) {
        // In ra 1 -> 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // In ra số chẵn 1 -> 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        // In ra 10 -> 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

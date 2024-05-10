public class MethodDemo {
    public static void main(String[] args) {
        Math math = null;

        math.showPI();

        int max = math.max(1, 1000);
        System.out.println("max = " + max);

        System.out.println("de 1 = " + math.lode());
        System.out.println("de 2 = " + math.lode());
        System.out.println("de 3 = " + math.lode());
    }
}

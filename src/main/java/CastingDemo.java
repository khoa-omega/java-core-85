public class CastingDemo {
    public static void main(String[] args) {
        // Widening
        // byte -> short -> int -> long -> float -> double
        int a = 1000;
        long b = a;
        System.out.println("b = " + b);

        // Narrowing
        // double -> float -> long -> int -> short -> byte
        long x = 8000000000L;
        int y = (int) x;
        System.out.println("y = " + y);

        // Bài toán
        int u = 1;
        int v = 2;

        System.out.println(u / v);
        System.out.println((float) u / v);
        System.out.println(u / (float) v);
        System.out.println((float) u / (float) v);
        System.out.println((float) (u / v));
    }
}

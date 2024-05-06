public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        // +, -, *, /, %
        int c = 100214 % 1000;
        System.out.println("c = " + c);

        // +=, -=, *=, /=, %=
        a += 10;
        System.out.println("a = " + a);

        // int d = b;
        // b = b + 1;
        int d = b++;
        System.out.println("d = " + d);

        // b = b + 1;
        // int e = b;
        int e = ++b;
        System.out.println("e = " + e);
    }
}

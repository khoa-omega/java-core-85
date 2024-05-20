public class DebugDemo {
    public static void main(String[] args) {
        hole();
        int[] numbers = {6, 2, 7, 3, 7, 1, 5, 3};
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("max = " + max);
    }

    public static void hole() {
        System.out.println("Line code");
        System.out.println("Line code");
        System.out.println("Line code");
        System.out.println("Line code");
        System.out.println("Line code");
    }
}

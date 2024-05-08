public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 6, 8};
        String[] names = new String[]{"Khoa", "Huy", "Long"};
        int[] array = new int[0];

        // Kích thước của mảng
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("names.length = " + names.length);
        System.out.println("array.length = " + array.length);

        // Truy cập dựa theo chỉ số (index)
        System.out.println("names[1] = " + names[1]);
        int lastIndex = numbers.length - 1;
        System.out.println("names[lastIndex] = " + numbers[lastIndex]);

        // Lặp các phần tử trong mảng
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }

        // Lặp các phần tử trong mảng (phải qua trái)
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}

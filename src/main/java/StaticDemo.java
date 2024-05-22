public class StaticDemo {
    public static void main(String[] args) {
        // Static: Thuộc về class
        Student s1 = new Student("Khoa", 20);
        Student s2 = new Student("Hùng", 15);
        s1.count = 10;
        System.out.println("s2.count = " + s2.count);

        // Truy cập thông qua tên class
        System.out.println("Student.count = " + Student.count);
        int max = Student.max(10, 100);
        System.out.println("max = " + max);

        // Static không thể truy cập non-static
        // Non-static có thể truy cập static
    }
}

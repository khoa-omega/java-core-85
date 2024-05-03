public class Program {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Bảo vệ";
        System.out.println("Tên phòng ban 1: " + department1.name);

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Giám đốc";
        System.out.println("Tên phòng ban 2: " + department2.name);
    }
}

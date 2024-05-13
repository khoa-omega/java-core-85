public class Department {
    int id;
    String name;

    Department() {
        System.out.println("Constructor 0 tham số");
        this.id = 0;
        this.name = "Phòng chờ";
    }

    Department(String name) {
        System.out.println("Constructor 1 tham số");
        this.id = 99;
        this.name = name;
    }

    Department(int id, String name) {
        System.out.println("Constructor 2 tham số");
        this.id = id;
        this.name = name;
    }
}

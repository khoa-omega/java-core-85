public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("Pet is running...");
    }

    public String getName() {
        return name;
    }
}

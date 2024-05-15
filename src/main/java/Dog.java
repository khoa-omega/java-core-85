public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(getName() + " is running...");
    }
}

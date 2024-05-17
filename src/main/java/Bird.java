public class Bird extends Animal implements Flyable, Runnable {
    @Override
    public void makeSound() {
        System.out.println("Líu lo");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public void run() {
        System.out.println("Bird can run...");
    }
}

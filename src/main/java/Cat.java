public class Cat extends Animal implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void run() {
        System.out.println("Cat can run...");
    }
}

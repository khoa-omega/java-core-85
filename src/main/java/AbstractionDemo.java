public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng: abstract class, interface
        // 1. Không thể khởi tạo đối tượng từ abstract class
        // Animal animal = new Animal();

        // 2. Class con phải là abstract class
        // hoặc phải triển khai abstract method của class cha
        Cat cat = new Cat();
        cat.run();
        cat.makeSound();

        // 3. Abstract class có thể không có abstract method nào

        // interface
        // Mặc định method: public abstract
        // - Không có constructor
        // - Không thể khởi tạo đối tượng
        // Từ khóa: implements
        // Đa kế thừa
        Bird bird = new Bird();
        bird.fly();
    }
}

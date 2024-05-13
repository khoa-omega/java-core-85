import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // public: Có thể truy cập được từ mọi nơi
        Dog dog1 = new Dog();
        dog1.age = 3;
        System.out.println("dog1.age = " + dog1.age);

        // protected: Có thể truy cập được trong cùng package
        // default: Có thể truy cập được trong cùng package
        // dog1.color = "Black";
        // System.out.println("dog1.color = " + dog1.color);

        // private: Chỉ có thể truy cập trong class đó
        // System.out.println("dog1.iq = " + dog1.iq);
    }
}

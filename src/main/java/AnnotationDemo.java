public class AnnotationDemo {
    public static void main(String[] args) {
        // Annotation: Chú thích
        // @Override
        class Dog {
            @Override
            public String toString() {
                return "Dog";
            }
        }
        Dog dog = new Dog();
        System.out.println("dog = " + dog);

        // @deprecated
        @SuppressWarnings("deprecation")
        int max = Math.max(1, 100);
        System.out.println("max = " + max);
    }
}

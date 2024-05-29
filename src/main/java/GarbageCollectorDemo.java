public class GarbageCollectorDemo {
    public static void main(String[] args) {
        class Animal {
            private String name;

            public Animal(String name) {
                this.name = name;
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println(name + " đang bị dọn dẹp");
            }
        }
        Animal a1 = new Animal("Dog");
        a1 = null;
        Animal a2 = new Animal("Cat");
        System.gc();
    }
}

public class OAnonymousClass {
    public static void main(String[] args) {
        A obj = new A() {
            // anonymous class
            public void show() {
                System.out.println("New showing...");
            }
        };
        obj.show();

        B obj2 = new B() {
            public void config() {
                System.out.println("Config ...");
            }
        };
        obj2.config();
    }

}

class A {
    public void show() {
        System.out.println("Showing...");
    }
}

abstract class B {
    public abstract void config();
}
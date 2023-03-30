class A {
    class B {
        public void show() {
            System.out.println("Show");
        }
    }

    static class C {
        public void config() {
            System.out.println("Config");
        }
    }
}

/**
 * NInnerClass
 */
public class NInnerClass {

    public static void main(String[] args) {
        A obj = new A();
        A.B obj2 = obj.new B();
        obj2.show();

        A.C obj3 = new A.C();
        obj3.config();
    }
}
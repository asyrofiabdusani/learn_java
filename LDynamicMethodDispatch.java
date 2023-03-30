class A {
    public void show() {
        System.out.println("Print in the A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Print in the B");
    }
}

class C extends A {
    public void show() {
        System.out.println("Print in the C");
    }
}

public class LDynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

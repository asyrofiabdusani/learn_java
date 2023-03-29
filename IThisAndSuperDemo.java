class A {
    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("int A");
    }
}

class B extends A {
    public B() {
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("int B");
    }

    public B(String n) {
        super(5);
        System.out.println("string B");
    }
}

public class IThisAndSuperDemo {
    public static void main(String[] args) {
        B obj = new B();

        new A(); // anonymous constructor
    }
}

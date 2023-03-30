class A {
    public void show() {
        System.out.println("show in A");
    }

    public void config() {
        System.out.println("in config A");
    }

}

class B extends A {
    public void show() {
        System.out.println("show in B");
    }

    public void config() {
        System.out.println("in config A");
    }

}

public class KMethodOveride {
    /**
     * A
     */

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}

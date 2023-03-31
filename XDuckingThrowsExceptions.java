public class XDuckingThrowsExceptions {
    static {
        System.out.println("Class loaded");
    }

    public static void main(String[] args) {
        A obj = new A();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Not found the class");
        }

    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("AbcClass");
    }
}

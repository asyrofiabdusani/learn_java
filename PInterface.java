public class PInterface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
    }

}

interface A {
    void show();

    void config();
}

class B implements A {

    @Override
    public void config() {
        System.out.println("Config");
    }

    @Override
    public void show() {
        System.out.println("Showing");
    }

}
public class GStaticDemo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 12000;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 14000;
        obj2.name = "Smartphone";

        obj1.name = "Phone";

        obj1.show();
        obj2.show();
    }
}

/**
 * Mobile
 */
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }
}
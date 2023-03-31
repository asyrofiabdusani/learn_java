public class TLambdaExpression {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Showing");
            }
        };
        obj.show();

        // lambda expression
        A obj2 = () -> {
            System.out.println("Showing");
        };
        obj2.show();

        // lambda with parameters
        B obj3 = (i) -> {
            System.out.println("Showing " + i);
        };

        obj3.show(3);

        // lambda with return type
        C obj4 = (n1, n2) -> n1 + n2;
        int result = obj4.add(2, 4);
        System.out.println(result);
    }
}

@FunctionalInterface
interface A {
    void show();

}

@FunctionalInterface
interface B {
    void show(int i);

}

@FunctionalInterface
interface C {
    int add(int n1, int n2);

}

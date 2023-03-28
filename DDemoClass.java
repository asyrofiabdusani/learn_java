public class DDemoClass {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        Calculator cal = new Calculator(); // create object
        int res = cal.add(x, y); // call method in calculator class

        System.out.println(res);
        System.out.println(cal.num);
    }
}

/**
 * Calculator class
 */
class Calculator {
    int num = 5;

    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

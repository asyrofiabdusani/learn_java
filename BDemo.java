public class BDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        boolean res = x < y;
        System.out.println(res);

        // ===============
        int a = 5;
        int b = 5;
        int c = 7;
        int d = 9;

        boolean res2 = a == b && c <= d;
        System.out.println(res2);

        // ===================
        if (a == b)
            System.out.println("True");

        if (a < c || a > d) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (a > b) {
            System.out.println("Same");
        } else if (a < c) {
            System.out.println("Smaller");
        } else {
            System.out.println("Else result");
        }

        boolean res3 = a == b ? true : false;
        System.out.println(res3);

        // ==================

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            default:
                System.out.println("Other day");
                break;
        }
    }
}

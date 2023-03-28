public class CDemoLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World");
            int j = 0;
            while (j < 2) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }

        // ===================

        int k = 5;
        do {
            System.out.println("Hello World Second");
        } while (k < 5);

        // ====================
        for (int l = 0; l < 4; l++) {
            System.out.println("Hello World");
        }
    }
}

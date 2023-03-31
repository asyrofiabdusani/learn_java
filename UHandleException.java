public class UHandleException {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;

        try {
            result = 10 / i;
        } catch (Exception e) {
            System.out.println("There is a problem");
        }

        System.out.println("The result is " + result);
    }
}

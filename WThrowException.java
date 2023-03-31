public class WThrowException {
    public static void main(String[] args) {
        int i = 8;
        int j = 0;
        int res = 0;

        try {
            res = i * j;
            if (res == 0) {
                throw new CustomException("can't multiple by zero");
            }
        } catch (CustomException e) {
            res = i + j;
            System.out.println(e);
            System.out.println("the result is " + res);
        }
    }
}

class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

}

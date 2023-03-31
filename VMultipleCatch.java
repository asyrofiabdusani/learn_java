public class VMultipleCatch {
    public static void main(String[] args) {
        int i = 2;
        int arr[] = new int[5];
        int j = 0;

        try {
            j = 18 / i;
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("can't input zero value");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is more than value");
        } catch (Exception e) {
            System.out.println("There is something wrong");
        }

        System.out.println(j);
    }
}

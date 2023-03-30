public class PEnum {
    public static void main(String[] args) {
        Status s = Status.pending;
        System.out.println(s);

        Status sArr[] = Status.values();
        System.out.println(sArr[1]);

        for (Status status : sArr) {
            System.out.println(status.ordinal() + " " + status);
        }
    }

}

enum Status {
    pending, running, success, failed
}
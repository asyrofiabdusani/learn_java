public class SEnum {
    public static void main(String[] args) {
        Status s = Status.pending;
        System.out.println(s);

        Status sArr[] = Status.values();
        System.out.println(sArr[1]);

        for (Status status : sArr) {
            System.out.println(status.ordinal() + " " + status);
        }

        Status currentStatus = Status.pending;
        if (currentStatus == Status.pending) {
            System.out.println("pending now");
        } else if (currentStatus == Status.running) {
            System.out.println("running now");
        } else {
            System.out.println("other status");
        }

        switch (currentStatus) {
            case pending:
                System.out.println("pending now");

                break;
            case running:
                System.out.println("running now");

                break;

            default:
                System.out.println("other status");
                break;
        }

        Laptop lap[] = Laptop.values();

        for (Laptop laptop : lap) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }

}

enum Status {
    pending, running, success, failed
}

enum Laptop {
    lenovo(2000), hp(4000), asus(30000);

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) {
        this.price = price;
    }

}
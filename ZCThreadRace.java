class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class ZCThreadRace {
    public static void main(String[] args) throws InterruptedException {

        Counter cot = new Counter();
        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                cot.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                cot.increment();
            }
        };

        Thread run1 = new Thread(obj1);
        Thread run2 = new Thread(obj2);

        run1.start();
        run2.start();

        run1.join();
        run2.join();

        System.out.println(cot.count);
    }

}

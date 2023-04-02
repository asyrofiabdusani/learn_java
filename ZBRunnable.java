public class ZBRunnable {
    public static void main(String[] args) {
        // method 1
        /*
         * Runnable obj1 = new A();
         * Runnable obj2 = new B();
         * 
         * Thread run1 = new Thread(obj1);
         * Thread run2 = new Thread(obj2);
         */

        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Running thread 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Running thread 2");
            }
        };

        Thread run1 = new Thread(obj1);
        Thread run2 = new Thread(obj2);

        run1.start();
        run2.start();
    }

}

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running thread 1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running thread 2");
        }
    }
}

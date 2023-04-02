public class ZAMultipleThreads {
    public static void main(String[] args) {
        A firstThread = new A();
        B secondThread = new B();

        firstThread.start();
        secondThread.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Running at thread 1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Running at thread 2");
        }
    }
}

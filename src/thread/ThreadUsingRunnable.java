package thread;

// FIRST THREAD
class Fthread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     throw new RuntimeException(e);
            // }
            System.out.println("First thread : " + i);
        }
    }
}

// SECOND THREAD
class Sthread implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Second thread : " + i);
        }
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        // FIRST THREAD
        Fthread obj1 = new Fthread();
        Thread th1 = new Thread(obj1);
        th1.start();

        // WAIT FOR 5 SECONDS...
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // SECOND THREAD
        Sthread obj2 = new Sthread();
        Thread th2 = new Thread(obj2);
        th2.start();
    }
}

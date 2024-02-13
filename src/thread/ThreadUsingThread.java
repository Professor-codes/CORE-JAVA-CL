package thread;

// FIRST THREAD
class Fsthread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("First thread : " + i);
        }
    }
}

// SECOND THREAD
class Scthread implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Second thread : " + i);
        }
    }
}

public class ThreadUsingThread {
    public static void main(String[] args) {
        Fsthread obj1 = new Fsthread();
        Thread th1 = new Thread(obj1);
        th1.start();

        try {
            Thread.sleep(10000);
            System.out.println("\nWait for sec...\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Scthread obj2 = new Scthread();
        Thread th2 = new Thread(obj2);
        th2.start();

    }
}

package thread;

// THREAD USING RUNNABLE INTERFACE
class FirstThread implements Runnable {
    // RUN METHOD
    @Override
    public void run() {
        System.out.println("thread start...");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadUsingImplements {
    public static void main(String[] args) {
        FirstThread obj = new FirstThread();
        Thread threadObj = new Thread(obj);

        // START METHOD
        threadObj.start();
    }
}

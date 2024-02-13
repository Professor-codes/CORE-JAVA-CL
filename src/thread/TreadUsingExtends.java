package thread;

// THREAD USING THREAD CLASS
class SecondThread extends Thread {
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

public class TreadUsingExtends {
    public static void main(String[] args) {
        SecondThread obj = new SecondThread();

        // START METHOD
        obj.start();
    }
}

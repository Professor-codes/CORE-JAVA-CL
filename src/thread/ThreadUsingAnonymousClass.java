package thread;

public class ThreadUsingAnonymousClass {
    public static void main(String[] args) {
        // ANONYMOUS WAY TO CREATE NEW THREAD
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                System.out.println("Test thread.");
            }
        };

        Thread thread = new Thread(obj);
        thread.start();
    }
}

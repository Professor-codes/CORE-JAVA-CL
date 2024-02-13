package thread;

public class ThreadUsingLambda {
    public static void main(String[] args) {
        // THREAD USING LAMBDA
        Runnable r = () -> {
            System.out.println("Test thread.");
        };

        Thread thread = new Thread(r);
        thread.start();
    }
}

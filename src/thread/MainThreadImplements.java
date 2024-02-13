package thread;

// USING RUNNABLE INTERFACE
class MyThread3 implements Runnable {
    // RUN METHOD
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Thread 1 is running...");
            i++;
        }
    }
}

class MyThread4 implements Runnable {
    // RUN METHOD
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Thread 2 is running...");
            i++;
        }
    }
}
public class MainThreadImplements {
    public static void main(String[] args) {
        MyThread3 obj3 = new MyThread3();
        Thread th1 = new Thread(obj3);
        MyThread4 obj4 = new MyThread4();
        Thread th2 = new Thread(obj4);

        th1.start();
        th2.start();

    }
}
